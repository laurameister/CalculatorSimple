package srs.nsu.com.calculatorsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickOne(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        String x = (String) e.getText();
        e.setText(x + "1");
    }

    public void onClickTwo(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        String x = (String) e.getText();
        e.setText(x + "2");
    }

    public void onClickThree(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        String x = (String) e.getText();
        e.setText(x + "3");
    }

    public void onClickFour(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        String x = (String) e.getText();
        e.setText(x + "4");
    }

    public void onClickFive(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        String x = (String) e.getText();
        e.setText(x + "5");
    }

    public void onClickSix(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        String x = (String) e.getText();
        e.setText(x + "6");
    }

    public void onClickSeven(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        String x = (String) e.getText();
        e.setText(x + "7");
    }

    public void onClickEight(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        String x = (String) e.getText();
        e.setText(x + "8");
    }

    public void onClickNine(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        String x = (String) e.getText();
        e.setText(x + "9");
    }

    public void onClickZero(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        String x = (String) e.getText();
        e.setText(x + "0");
    }

    public void onClickDot(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        String a = (String) e.getText();
        e.setText(a + ".");

    }

    public void onEqual(String x){
        TextView e = (TextView) findViewById(R.id.text_edit);
        TextView f = (TextView) findViewById(R.id.show_prev);
        TextView g = (TextView) findViewById(R.id.show_operator);

        //String x = (String) g.getText();

        if (x.equals("+")) {

            float a = Float.parseFloat((String) f.getText());
            float b = Float.parseFloat((String) e.getText());
            float c = a + b;
            f.setText(Float.toString(c));
            e.setText(null);

        }

        if (x.equals("-")) {

            float a = Float.parseFloat((String) f.getText());
            float b = Float.parseFloat((String) e.getText());
            float c = a - b;
            f.setText(Float.toString(c));
            e.setText(null);

        }

        if (x.equals("*")) {

            float a = Float.parseFloat((String) f.getText());
            float b = Float.parseFloat((String) e.getText());
            float c = a * b;
            f.setText(Float.toString(c));
            e.setText(null);

        }

        if (x.equals("/")) {

            float a = Float.parseFloat((String) f.getText());
            float b = Float.parseFloat((String) e.getText());
            float c = a / b;
            f.setText(Float.toString(c));
            e.setText(null);
        }

    }

    public void onClickEqual(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        TextView f = (TextView) findViewById(R.id.show_prev);
        TextView g = (TextView) findViewById(R.id.show_operator);

        String x = (String) g.getText();

        onEqual(x);

        if(TextUtils.isEmpty(f.getText().toString())
                || TextUtils.isEmpty(e.getText().toString())) {
            return;
        }

        /*
        String x = (String) g.getText();

        if (TextUtils.isEmpty(f.getText().toString())
                || TextUtils.isEmpty(e.getText().toString())) {
            return;
        }

        if (x.equals("+")) {

            float a = Float.parseFloat((String) f.getText());
            float b = Float.parseFloat((String) e.getText());
            float c = a + b;
            f.setText(Float.toString(c));
            e.setText(null);

        }

        if (x.equals("-")) {

            float a = Float.parseFloat((String) f.getText());
            float b = Float.parseFloat((String) e.getText());
            float c = a - b;
            f.setText(Float.toString(c));
            e.setText(null);

        }

        if (x.equals("*")) {

            float a = Float.parseFloat((String) f.getText());
            float b = Float.parseFloat((String) e.getText());
            float c = a * b;
            f.setText(Float.toString(c));
            e.setText(null);

        }

        if (x.equals("/")) {

            float a = Float.parseFloat((String) f.getText());
            float b = Float.parseFloat((String) e.getText());
            float c = a / b;
            f.setText(Float.toString(c));
            e.setText(null);

        } else if (e.getText() == null && f.getText() == null) {
            g.setText(null);
        }
        */
        //g.setText(null);

    }

    public void setOperators(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        TextView f = (TextView) findViewById(R.id.show_prev);
        TextView g = (TextView) findViewById(R.id.show_operator);

        String x = (String) g.getText();

        if (x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")) {
            f.setText(e.getText());
            e.setText(null);
        }
    }

    public void onClickAdd(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        TextView f = (TextView) findViewById(R.id.show_prev);
        TextView g = (TextView) findViewById(R.id.show_operator);

        g.setText("+");

        if (TextUtils.isEmpty(e.getText().toString())
                || TextUtils.isEmpty(f.getText().toString())) {
            setOperators(view);
            return;
        }


        float a = Float.parseFloat((String) f.getText());
        float b = Float.parseFloat((String) e.getText());

        f.setText(Float.toString(a+b));

        e.setText(null);



    }


    public void onClickSubtract(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        TextView f = (TextView) findViewById(R.id.show_prev);
        TextView g = (TextView) findViewById(R.id.show_operator);

        g.setText("-");

        if (TextUtils.isEmpty(e.getText().toString())
                || TextUtils.isEmpty(f.getText().toString())) {
           setOperators(view);
            return;
        }


        float a = Float.parseFloat((String) f.getText());
        float b = Float.parseFloat((String) e.getText());

        f.setText(Float.toString(a - b));

        e.setText(null);
    }

    public void onClickMultiply(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        TextView f = (TextView) findViewById(R.id.show_prev);
        TextView g = (TextView) findViewById(R.id.show_operator);

        g.setText("*");

        if (TextUtils.isEmpty(e.getText().toString())
                || TextUtils.isEmpty(f.getText().toString())) {
            setOperators(view);
            return;
        }


        float a = Float.parseFloat((String) f.getText());
        float b = Float.parseFloat((String) e.getText());

        f.setText(Float.toString(a * b));

        e.setText(null);
    }

    public void onClickDivide(View view) {
        TextView e = (TextView) findViewById(R.id.text_edit);
        TextView f = (TextView) findViewById(R.id.show_prev);
        TextView g = (TextView) findViewById(R.id.show_operator);

        g.setText("/");


        if (TextUtils.isEmpty(e.getText().toString())
                || TextUtils.isEmpty(f.getText().toString())) {
            setOperators(view);
            return;
        }


        float a = Float.parseFloat((String) f.getText());
        float b = Float.parseFloat((String) e.getText());

        f.setText(Float.toString(a / b));

        e.setText(null);
    }

     public void onClickBackspace(View view){
        TextView e = (TextView) findViewById(R.id.text_edit);
        TextView f = (TextView) findViewById(R.id.show_prev);
        TextView g = (TextView) findViewById(R.id.show_operator);
         String s = "";
        String t = (String) e.getText();
        for(int i=0;i<t.length()-1;i++){
            s = s + t.charAt(i);
        }
        e.setText(s);

        /*if(TextUtils.isEmpty(e.getText())) {
            f.setText(null);
        }*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
