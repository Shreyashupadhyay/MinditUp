package com.example.minditup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrepessionTest extends Fragment {

    public DrepessionTest() {
        // Required empty public constructor
    }

    private FrameLayout parentFrameLayout;
    
private TextView question,questionNumber;
private Button option1Btn, option2Btn, option3Btn, option4Btn, option5Btn;
private ArrayList<DepTestModal> depTestModalArrayList;

//Random random;
    int currentScore = 0, questionAttempted = 1, currentPos;
    int max_score;
    int low_self_esteme=0,lack_of_focus=0,low_interest=0,fatigue=0,anxiety=0,netative_thoughts=0;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_drepession_test, container, false);
        parentFrameLayout = getActivity().findViewById(R.id.depressed_FrameLayout);

        question = view.findViewById(R.id.question);
        questionNumber = view.findViewById(R.id.questionNumber);
        option1Btn = view.findViewById(R.id.idBtnOption1);
        option2Btn = view.findViewById(R.id.idBtnOption2);
        option3Btn = view.findViewById(R.id.idBtnOption3);
        option4Btn = view.findViewById(R.id.idBtnOption4);
        option5Btn = view.findViewById(R.id.idBtnOption5);
        depTestModalArrayList = new ArrayList<>();

//        random = new Random();
        getQuizQuestion(depTestModalArrayList);
//        currentPos = random.nextInt(depTestModalArrayList.size());
        currentPos= 0;
        setDataToViews(currentPos);

        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                max_score=4;
                currentScore=currentScore+max_score;
                questionAttempted++;

                if(currentPos==6)
                    low_self_esteme=max_score;
                if(currentPos==10)
                    lack_of_focus=max_score;
                if(currentPos==8)
                    low_interest=max_score;
                if(currentPos==7)
                    fatigue=max_score;
                if(currentPos==9)
                    anxiety=max_score;
                if(currentPos==5)
                    netative_thoughts=max_score;

                currentPos=currentPos+1;

                setDataToViews(currentPos);
            }

        });

        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                max_score=3;
                currentScore=currentScore+max_score;
                questionAttempted++;

                if(currentPos==6)
                    low_self_esteme=max_score;
                if(currentPos==10)
                    lack_of_focus=max_score;
                if(currentPos==8)
                    low_interest=max_score;
                if(currentPos==7)
                    fatigue=max_score;
                if(currentPos==9)
                    anxiety=max_score;
                if(currentPos==5)
                    netative_thoughts=max_score;

                currentPos=currentPos+1;

                setDataToViews(currentPos);
            }

        });
        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                max_score=2;
                currentScore=currentScore+max_score;
                questionAttempted++;

                if(currentPos==6)
                    low_self_esteme=max_score;
                if(currentPos==10)
                    lack_of_focus=max_score;
                if(currentPos==8)
                    low_interest=max_score;
                if(currentPos==7)
                    fatigue=max_score;
                if(currentPos==9)
                    anxiety=max_score;
                if(currentPos==5)
                    netative_thoughts=max_score;

                currentPos=currentPos+1;

                setDataToViews(currentPos);
            }

        });
        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                max_score=1;
                currentScore= currentScore+max_score;
                questionAttempted++;

                if(currentPos==6)
                    low_self_esteme=max_score;
                if(currentPos==10)
                    lack_of_focus=max_score;
                if(currentPos==8)
                    low_interest=max_score;
                if(currentPos==7)
                    fatigue=max_score;
                if(currentPos==9)
                    anxiety=max_score;
                if(currentPos==5)
                    netative_thoughts=max_score;

                currentPos=currentPos+1;

                setDataToViews(currentPos);
            }

        });

        option5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                max_score=0;
                currentScore= currentScore+0;
                questionAttempted++;

                if(currentPos==6)
                    low_self_esteme=max_score;
                if(currentPos==10)
                    lack_of_focus=max_score;
                if(currentPos==8)
                    low_interest=max_score;
                if(currentPos==7)
                    fatigue=max_score;
                if(currentPos==9)
                    anxiety=max_score;
                if(currentPos==5)
                    netative_thoughts=max_score;

                currentPos=currentPos+1;

                setDataToViews(currentPos);

            }

        });
        
        return view;
    }

    private void setDataToViews(int currentPos) {

        questionNumber.setText(questionAttempted + "/12"+"questions answered");
        if(questionAttempted > 12){
            currentScore = 5;
            DepScoreFragment dsp= new DepScoreFragment();
            Bundle bundle= new Bundle();
            bundle.putInt("currentscore",currentScore);
            bundle.putInt("low_self_esteme",low_self_esteme);
            bundle.putInt("lack_of_focus",lack_of_focus);
            bundle.putInt("low_interest",low_interest);
            bundle.putInt("fatigue",fatigue);
            bundle.putInt("anxiety",anxiety);
            bundle.putInt("netative_thoughts",netative_thoughts);
            dsp.setArguments(bundle);
            FragmentTransaction ft= getFragmentManager().beginTransaction();
//            FragmentTransaction.addToBackStack(null);
            ft.replace(R.id.depressed_FrameLayout,dsp);
            ft.commit();
//            Todo:
        }else{
                question.setText(depTestModalArrayList.get(currentPos).getQuestion());
                option1Btn.setText(depTestModalArrayList.get(currentPos).getOption1());
                option2Btn.setText(depTestModalArrayList.get(currentPos).getOption2());
                option3Btn.setText(depTestModalArrayList.get(currentPos).getOption3());
                option4Btn.setText(depTestModalArrayList.get(currentPos).getOption4());
                option5Btn.setText(depTestModalArrayList.get(currentPos).getOption5());
        }
    }

    private void getQuizQuestion(ArrayList<DepTestModal> depTestModalArrayList) {
        depTestModalArrayList.add(new DepTestModal(1,"Could you tell us about your sleeping patterns in the last few weeks?","I've been sleeping more than usual", "I've been sleeping less than usual","I've been sleeping more but somewhat usual",
                "I've been sleeping less but somewhat usual","I haven't noticed any changes"));

        depTestModalArrayList.add(new DepTestModal(2,"How often does this happen? (Related to previous question)","Rarely","All the Time","Sometimes","Often","Manytimes"));

        depTestModalArrayList.add(new DepTestModal(3,"How has your appetite pattern been over past few weeks?","I've larger appetite than usual","I've a very smaller appetite than usual","I,ve larger appetite but somewhat usual","I've a smaller appetite but somewhat usual","I haven't noticed any changes"));

        depTestModalArrayList.add(new DepTestModal(4,"How often does this happen? (Related to previous question)","Rarely","All the Time","Sometimes","Often","Manytimes"));

        depTestModalArrayList.add(new DepTestModal(5,"Have you been less active than usual?","A lot","Quite a bit","Somewhat","Maybe a little","Not Really"));

        depTestModalArrayList.add(new DepTestModal(6,"I've a tendency to look at things negatively.","Completely True","Somewhat True","I'm unsure","Somewhat Untrue","Completely Untrue"));

        depTestModalArrayList.add(new DepTestModal(7,"I don't Think I'm good enough.","Strongly Agree","Agreed","Neutral","Disagree","Strongly Disagree"));

        depTestModalArrayList.add(new DepTestModal(8,"I've feel that even minor tasks seems to take a lot of effort for me.","Completely True","Somewhat True","I'm Unsure","somewhat Untrue","Completely Untrue"));

        depTestModalArrayList.add(new DepTestModal(9,"I'm not interested in doing activities that I used to like.","Strongly Agree","Agreed","Neutral","Disagree","Strongly Disagree"));

        depTestModalArrayList.add(new DepTestModal(10,"I feel nervous or Anxious.","Always","A lot of time","Maybe sometimes","Not very often","Never"));

        depTestModalArrayList.add(new DepTestModal(11,"It's difficult for me to concentrate on my hobbies.","Always","Most of the time","Maybe sometimes","Hardly ever","Never"));

        depTestModalArrayList.add(new DepTestModal(12,"Do you believe that depression makes it difficicult for you to work, socialise or take care of yourself?","Always","Often","Sometimes","Rarely","Never"));
    }
}