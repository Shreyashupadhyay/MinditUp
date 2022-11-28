package com.example.minditup;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class StressScoreFragment extends Fragment {
    private PieChart pieChart;
    private TextView scoretext;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_stress_score, container, false);


//        int bb = bundle.getInt("low_self_esteme");

        pieChart = (PieChart) v.findViewById(R.id.activity_str_main_piechart);
        setupPieChart();

        Bundle bundle = new Bundle();
        bundle=getArguments();
        int lse = bundle.getInt("poor_health");
        int lof = bundle.getInt("lack_of_focus");
        int li = bundle.getInt("trouble_relaxing");
        int fat = bundle.getInt("com_prob");
        int anx = bundle.getInt("pps");
        int nt = bundle.getInt("netative_thoughts");
        int score = bundle.getInt("currentscore");

        loadPieChartData(lse,lof,li,fat,anx,nt);
        scoretext=v.findViewById(R.id.scoretext);
//        scoretext.setText(score);

//        Bundle bundle = new Bundle();
//        bundle=getArguments();


        return v;


    }

    private void setupPieChart() {
        pieChart.setDrawHoleEnabled(true);
        pieChart.setUsePercentValues(true);
        pieChart.setEntryLabelTextSize(12);
        pieChart.setEntryLabelColor(Color.BLACK);
        pieChart.setCenterText("Based On Your Answer");
        pieChart.setCenterTextSize(24);
        pieChart.getDescription().setEnabled(false);

        Legend l = pieChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(false);
        l.setEnabled(false);
    }

    private void loadPieChartData(int lse,int lof,int li,int fat ,int anx,int nt) {

        ArrayList<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(lse, "Poor Health"));
        entries.add(new PieEntry(lof, "Lack of Focus"));
        entries.add(new PieEntry(li, "Trouble Relaxing"));
        entries.add(new PieEntry(fat, "Communication Problem"));
        entries.add(new PieEntry(anx, "Poor Problem Solving"));
        entries.add(new PieEntry(nt, "Negative Thoughts"));
//        textView2.setText(score);
        ArrayList<Integer> colors = new ArrayList<>();
        for (int color: ColorTemplate.MATERIAL_COLORS) {
            colors.add(color);
        }

        for (int color: ColorTemplate.VORDIPLOM_COLORS) {
            colors.add(color);
        }

        PieDataSet dataSet = new PieDataSet(entries, "Expense Category");
        dataSet.setColors(colors);

        PieData data = new PieData(dataSet);
        data.setDrawValues(true);
//        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(12f);
        data.setValueTextColor(Color.BLACK);

        pieChart.setData(data);
        pieChart.invalidate();

        pieChart.animateY(1400, Easing.EaseInOutQuad);
    }

}