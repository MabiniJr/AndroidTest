package com.example.uites;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.uites.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up AutoCompleteTextView for Name
        AutoCompleteTextView nameInput = findViewById(R.id.name_input);
        String[] names = { "John Doe", "Jane Smith", "Alice Johnson" };
        setupDropdown(nameInput, names);

        // Set up AutoCompleteTextView for ID
        AutoCompleteTextView idInput = findViewById(R.id.id_input);
        String[] ids = {"12345", "67890", "11223"};
        setupDropdown(idInput, ids);

        // Set up AutoCompleteTextView for Course/Section
        AutoCompleteTextView courseInput = findViewById(R.id.course_input);
        String[] courses = {"BSCS 1-A", "BSIT 2-B", "BSECE 3-C"};
        setupDropdown(courseInput, courses);

        // Set up AutoCompleteTextView for Date
        AutoCompleteTextView dateInput = findViewById(R.id.date_input);
        String[] dates = {"2025-01-01", "2025-01-02", "2025-01-03"};
        setupDropdown(dateInput, dates);
    }

    /**
     * Utility method to set up dropdown for AutoCompleteTextView
     *
     * @param inputField AutoCompleteTextView to configure
     * @param items      Predefined dropdown items
     */
    private void setupDropdown(AutoCompleteTextView inputField, String[] items) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items);
        inputField.setAdapter(adapter);

        // Ensure dropdown shows when the field or arrow is clicked
        inputField.setOnTouchListener((v, event) -> {
            inputField.showDropDown();
            return false; // Allow the default behavior
        });
    }
}
