package learning.spb.com.listviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

//How to construct and populate a ListView
//How to customize the layout
//How to style and beautify a ListView
//How to optimize a ListView’s performance
public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        ListViewAdapter newAdapter = new ListViewAdapter();
        mListView = (ListView)findViewById(R.id.first_list_view);
        mListView.setAdapter(newAdapter);

    }


    class ListViewAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.list_view_adapter,null);

            TextView tv = (TextView)convertView.findViewById(R.id.text_edit_view);
            tv.setText(list.get(position));
            return convertView;
        }
    }
}
