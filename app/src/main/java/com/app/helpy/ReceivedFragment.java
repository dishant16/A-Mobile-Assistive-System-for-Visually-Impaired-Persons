package com.app.helpy;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;


public class ReceivedFragment extends Fragment {

    public ReceivedFragment() {
        // Required empty public constructor
    }

    private ListView received;
    private ArrayList<Message> list = new ArrayList<>();
    private TextToSpeech tts;
    int x=1;


    @Override
    public void onResume() {
        speak();
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_received, container, false);
        received = view.findViewById(R.id.received);
        getReceivedMessages();
        CustomAdapter customAdapter = new CustomAdapter(getContext(), list);
        received.setAdapter(customAdapter);
        received.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Message message = list.get(position);
                Intent intent = new Intent(getActivity(),SMSDetailActivity.class);
                intent.putExtra("Name",message.getAddress());
                intent.putExtra("Message",message.getBody());
                intent.putExtra("Date",message.getDate());
                intent.putExtra("Sent",x);
                startActivity(intent);
            }
        });
        received.setEmptyView(view.findViewById(R.id.empty_view));
        return view;
    }

    private void speak(){
        tts=new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                String text = "In received messages "+"Swipe left to sent messages";
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                }
            }
        });
    }

    private void getReceivedMessages() {

        ContentResolver contentResolver = requireActivity().getApplicationContext().getContentResolver();
        try (Cursor smsCursor = contentResolver.query(Uri.parse("content://sms/inbox"), null, null, null, null)) {
            if (smsCursor.moveToFirst()) {
                String date;
                String address;
                String body;

                int dateColumn = smsCursor.getColumnIndex("date");
                int addressColumn = smsCursor.getColumnIndex("address");
                int bodyColumn = smsCursor.getColumnIndex("body");

                do {
                    date = smsCursor.getString(dateColumn);
                    body = smsCursor.getString(bodyColumn);
                    address = smsCursor.getString(addressColumn);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(Long.parseLong(date));
                    String formattedDate = new SimpleDateFormat("dd/MM/yy hh:mm aa", Locale.US).format(Calendar.getInstance().getTime());
                    list.add(new Message(body, address, formattedDate));

                } while (smsCursor.moveToNext());
            }
        } catch (Exception e) {
            Log.e("Dishant", Objects.requireNonNull(e.getMessage()));
        }
    }
}
