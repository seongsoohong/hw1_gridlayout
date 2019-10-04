package com.example.hw1_gridlayout;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HorizontalScrollView ScrollView = new HorizontalScrollView(this);

        GridLayout root = new GridLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        root.setLayoutParams(rParams);
        root.setOrientation(GridLayout.VERTICAL);
        root.setColumnCount(5);
        root.setRowCount(11);
        ScrollView.addView(root);


        for (int i = 0; i <= 10; i++) {
            TextView tv = new TextView(this);
            tv.setText(String.valueOf(i+1));
            tv.setTextSize(16);
            tv.setBackgroundColor(Color.LTGRAY);

            GridLayout.Spec row_spec = GridLayout.spec(i);
            GridLayout.Spec col_spec = GridLayout.spec(0);
            GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setGravity(7);
            tv.setLayoutParams(cParams);
            root.addView(tv);
        }

        TextView tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setTextSize(16);
        tv.setTextColor(Color.WHITE);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        GridLayout.Spec row_spec = GridLayout.spec(0);
        GridLayout.Spec col_spec = GridLayout.spec(1, 4);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Properties");
        tv.setTextSize(16);

        row_spec = GridLayout.spec(1,2 ,1);
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        cParams.setGravity(77);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLUE);

        row_spec = GridLayout.spec(3 );
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLUE);

        row_spec = GridLayout.spec(4 );
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLUE);

        row_spec = GridLayout.spec(5 );
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextSize(16);

        row_spec = GridLayout.spec(6 );
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("R10");
        tv.setTextSize(16);

        row_spec = GridLayout.spec(7 );
        col_spec = GridLayout.spec(1,1,1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("R20");
        tv.setTextSize(16);

        row_spec = GridLayout.spec(8 );
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("R30");
        tv.setTextSize(16);

        row_spec = GridLayout.spec(9 );
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("R40");
        tv.setTextSize(16);

        row_spec = GridLayout.spec(10 );
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("name");
        tv.setTextSize(16);

        row_spec = GridLayout.spec(1 );
        col_spec = GridLayout.spec(2,2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("category");
        tv.setTextSize(16);

        row_spec = GridLayout.spec(2 );
        col_spec = GridLayout.spec(2,2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("C1");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLUE);
        row_spec = GridLayout.spec(3 );
        col_spec = GridLayout.spec(2, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new  TextView(this);
        tv.setText("min >= hour && hour <= max");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLUE);
        cParams.setGravity(7);
        row_spec = GridLayout.spec(4 );
        col_spec = GridLayout.spec(2, 2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("int min ");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLUE);
        row_spec = GridLayout.spec(5 );
        col_spec = GridLayout.spec(2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("From");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.YELLOW);
        row_spec = GridLayout.spec(6 );
        col_spec = GridLayout.spec(2,1,1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("0");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.YELLOW);
        row_spec = GridLayout.spec(7 );
        col_spec = GridLayout.spec(2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("12");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.YELLOW);
        row_spec = GridLayout.spec(8 );
        col_spec = GridLayout.spec(2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("18");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.YELLOW);
        row_spec = GridLayout.spec(9 );
        col_spec = GridLayout.spec(2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("22");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.YELLOW);
        row_spec = GridLayout.spec(10 );
        col_spec = GridLayout.spec(2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("int max");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLUE);
        row_spec = GridLayout.spec(5 );
        col_spec = GridLayout.spec(3);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("To");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.YELLOW);
        row_spec = GridLayout.spec(6 );
        col_spec = GridLayout.spec(3,1,1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("11");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.YELLOW);
        row_spec = GridLayout.spec(7 );
        col_spec = GridLayout.spec(3);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setTextAlignment(TextView.TEXT_ALIGNMENT_VIEW_END);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("17");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.YELLOW);
        row_spec = GridLayout.spec(8 );
        col_spec = GridLayout.spec(3);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setTextAlignment(TextView.TEXT_ALIGNMENT_VIEW_END);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("21");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.YELLOW);
        row_spec = GridLayout.spec(9 );
        col_spec = GridLayout.spec(3);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setTextAlignment(TextView.TEXT_ALIGNMENT_VIEW_END);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("23");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.YELLOW);
        row_spec = GridLayout.spec(10 );
        col_spec = GridLayout.spec(3);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setTextAlignment(TextView.TEXT_ALIGNMENT_VIEW_END);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("DAy Hour Classification");
        tv.setTextSize(16);
        row_spec = GridLayout.spec(1 );
        col_spec = GridLayout.spec(4);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Day and Time");
        tv.setTextSize(16);
        row_spec = GridLayout.spec(2 );
        col_spec = GridLayout.spec(4);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("A1");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLUE);
        row_spec = GridLayout.spec(3 );
        col_spec = GridLayout.spec(4);
        tv.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("System.out.printingln(greeting=\".World!\")");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLUE);
        row_spec = GridLayout.spec(4 );
        col_spec = GridLayout.spec(4,1,2);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLUE);
        row_spec = GridLayout.spec(5 );
        col_spec = GridLayout.spec(4);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.RED);
        row_spec = GridLayout.spec(6 );
        col_spec = GridLayout.spec(4);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Morning");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.RED);
        row_spec = GridLayout.spec(7 );
        col_spec = GridLayout.spec(4);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.RED);
        row_spec = GridLayout.spec(8 );
        col_spec = GridLayout.spec(4);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Evening");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.RED);
        row_spec = GridLayout.spec(9 );
        col_spec = GridLayout.spec(4);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("GOOD NIGHT");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.RED);
        row_spec = GridLayout.spec(10 );
        col_spec = GridLayout.spec(4);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setGravity(7);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        setContentView(ScrollView);
        //setContentView(R.layout.activity_main);

    }
}



