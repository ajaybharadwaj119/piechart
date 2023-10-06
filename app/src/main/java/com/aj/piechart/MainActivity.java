package com.aj.piechart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart pieChart = findViewById(R.id.pieChart);

        // Create a list of PieEntry objects (slices of the pie chart)
        List<PieEntry> pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(25f, "Category 1"));
        pieEntries.add(new PieEntry(35f, "Category 2"));
        pieEntries.add(new PieEntry(40f, "Category 3"));

        // Create a PieDataSet
        PieDataSet dataSet = new PieDataSet(pieEntries, "My Pie Chart");

        // Set colors for each slice
        dataSet.setColors(Color.RED, Color.GREEN, Color.BLUE);

        // Create a PieData object from the dataSet
        PieData pieData = new PieData(dataSet);

        // Set various chart properties
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false); // Disable chart description
        pieChart.setCenterText("Pie Chart"); // Center text
        pieChart.animateY(1000); // Animation duration

    }
}