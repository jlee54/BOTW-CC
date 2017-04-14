package csce466.botw_cc;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    SQLiteDBHelper db;
    final ArrayList<TextView> textList = new ArrayList<TextView>();
    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
        db = new SQLiteDBHelper(this);
        final SQLiteDatabase dbREAD = db.getReadableDatabase();

        final EditText mainInput = (EditText) findViewById(R.id.mainInputText);
        final TextView firstInput = (TextView) findViewById(R.id.firstInputText);
        final TextView secondInput = (TextView) findViewById(R.id.secondInputText);
        final TextView thirdInput = (TextView) findViewById(R.id.thirdInputText);
        final TextView fourthInput = (TextView) findViewById(R.id.fourthInputText);
        final TextView fifthInput = (TextView) findViewById(R.id.fifthInputText);
        textList.add(firstInput);
        textList.add(secondInput);
        textList.add(thirdInput);
        textList.add(fourthInput);
        textList.add(fifthInput);
        final TextView suggestionInput = (EditText) findViewById(R.id.mainInputTextSuggestion);
        Button bAdd =(Button)findViewById(R.id.button_add);
        final TextView recipeName = (TextView) findViewById(R.id.recipeName);

        //Bring keyboard up
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        ((InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE)).showSoftInput(mainInput, 0);

        //fill inputs on button click
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onEnter(dbREAD, suggestionInput, mainInput, recipeName);
            }
        });

        //Remove hint on text change
        TextWatcher fieldValidatorTextWatcher = new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mainInput.setHint("");
                suggestionInput.setText(findSuggestion(mainInput, dbREAD));
            }
        };
        mainInput.addTextChangedListener(fieldValidatorTextWatcher);

        mainInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    onEnter(dbREAD, suggestionInput, mainInput, recipeName);
                    return true;
                } else {
                    return false;
                }
            }
        });

        //fill inputs on physical keyboard enter
        mainInput.setOnKeyListener(new OnKeyListener()
        {
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if (event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    switch (keyCode)
                    {
                        case KeyEvent.KEYCODE_ENTER:
                            onEnter(dbREAD, suggestionInput, mainInput, recipeName);
                        default:
                            break;
                    }
                }
                return false;
            }
        });

    }

    public void onEnter(SQLiteDatabase dbREAD, TextView suggestionInput, TextView mainInput, TextView recipeName) {
        if(!suggestionInput.getText().equals("")) {
            mainInput.setText(suggestionInput.getText());
            if (textList.get(0).getText().toString().trim().equals(""))
                textList.get(0).setText(mainInput.getText());
            else if (textList.get(1).getText().toString().trim().equals(""))
                textList.get(1).setText(mainInput.getText());
            else if (textList.get(2).getText().toString().trim().equals(""))
                textList.get(2).setText(mainInput.getText());
            else if (textList.get(3).getText().toString().trim().equals(""))
                textList.get(3).setText(mainInput.getText());
            else if (textList.get(4).getText().toString().trim().equals(""))
                textList.get(4).setText(mainInput.getText());
            mainInput.setText("");
            mainInput.setHint("Input Item");
            recipeName.setText(computeRecipe(dbREAD));
        }
    }

    public CharSequence findSuggestion(TextView input, SQLiteDatabase dbREAD){
        if(input.length() == 0){
            return "";
        } else {
            return SQLiteDBHelper.findMaterialByName(dbREAD, input.getText().toString());
        }

    }

    public void buttonRemove(View view) {
        if (view.getId() == R.id.firstButtonRemove) {
            sortTextFields(0);
        } else if (view.getId() == R.id.secondButtonRemove) {
            sortTextFields(1);
        } else if (view.getId() == R.id.thirdButtonRemove){
            sortTextFields(2);
        } else if (view.getId() == R.id.fourthButtonRemove){
            sortTextFields(3);
        } else {
            sortTextFields(4);
        }
    }

    public void sortTextFields(int index){
        textList.get(index).setText("");
        while(index < textList.size()-1){
            textList.get(index).setText(textList.get(index+1).getText());
            textList.get(index+1).setText("");
            index++;
        }
    }

    public String computeRecipe(SQLiteDatabase dbREAD){

        if(!textList.get(0).getText().equals("")){
            String one = textList.get(0).getText().toString();
            String two = textList.get(1).getText().toString();
            String three = textList.get(2).getText().toString();
            String four = textList.get(3).getText().toString();
            String five = textList.get(4).getText().toString();


            int ret_id = SQLiteDBHelper.findRecipeIdByMaterials(dbREAD, SQLiteDBHelper.findMaterialIdByName(dbREAD, toTitleCase(one)),
                    two.equals("") ? 0 : SQLiteDBHelper.findMaterialIdByName(dbREAD, toTitleCase(two)),
                    three.equals("") ? 0 : SQLiteDBHelper.findMaterialIdByName(dbREAD, toTitleCase(three)),
                    four.equals("") ? 0 : SQLiteDBHelper.findMaterialIdByName(dbREAD, toTitleCase(four)),
                    five.equals("") ? 0 : SQLiteDBHelper.findMaterialIdByName(dbREAD, toTitleCase(five)));
            if(ret_id != 0)
                return SQLiteDBHelper.findRecipeNameById(dbREAD, ret_id);
        }

        return "";
    }

    public static String toTitleCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
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

        /**
         * A placeholder fragment containing a simple view.
         */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
