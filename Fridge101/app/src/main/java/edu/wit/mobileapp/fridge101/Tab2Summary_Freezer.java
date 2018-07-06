package edu.wit.mobileapp.fridge101;

        import android.support.design.widget.TabLayout;
        import android.support.v4.app.Fragment;
        import android.os.Bundle;
        import android.support.v4.view.ViewPager;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

public class Tab2Summary_Freezer extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2summary_freezer, container, false);
        return rootView;

    }

}