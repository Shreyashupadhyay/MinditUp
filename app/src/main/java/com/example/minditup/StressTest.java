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
public class StressTest extends Fragment {

    public StressTest() {
        // Required empty public constructor
    }

    private FrameLayout parentFrameLayout;
    
private TextView question,questionNumber;
private Button option1Btn, option2Btn, option3Btn, option4Btn, option5Btn;
private ArrayList<DepTestModal> strTestModalArrayList;

//Random random;
    int currentScore = 0, questionAttempted = 1, currentPos;
    int max_score;
    int poor_health=0,trouble_relaxing=0,com_prob=0,pps=0,lack_of_focus=0,netative_thoughts=0, pwlb=0;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stress_test, container, false);
        parentFrameLayout = getActivity().findViewById(R.id.stress_FrameLayout);

        question = view.findViewById(R.id.question);
        questionNumber = view.findViewById(R.id.questionNumber);
        option1Btn = view.findViewById(R.id.idBtnOption1);
        option2Btn = view.findViewById(R.id.idBtnOption2);
        option3Btn = view.findViewById(R.id.idBtnOption3);
        option4Btn = view.findViewById(R.id.idBtnOption4);
        option5Btn = view.findViewById(R.id.idBtnOption5);
        strTestModalArrayList = new ArrayList<>();

//        random = new Random();
        getQuizQuestion(strTestModalArrayList);
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
                    poor_health=max_score;
                if(currentPos==10)
                    lack_of_focus=max_score;
                if(currentPos==8)
                    trouble_relaxing=max_score;
                if(currentPos==7)
                    com_prob=max_score;
                if(currentPos==9)
                    pps=max_score;
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
                    poor_health=max_score;
                if(currentPos==10)
                    lack_of_focus=max_score;
                if(currentPos==8)
                    trouble_relaxing=max_score;
                if(currentPos==7)
                    com_prob=max_score;
                if(currentPos==9)
                    pps=max_score;
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
                    poor_health=max_score;
                if(currentPos==10)
                    lack_of_focus=max_score;
                if(currentPos==8)
                    trouble_relaxing=max_score;
                if(currentPos==7)
                    com_prob=max_score;
                if(currentPos==9)
                    pps=max_score;
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
                    poor_health=max_score;
                if(currentPos==10)
                    lack_of_focus=max_score;
                if(currentPos==8)
                    trouble_relaxing=max_score;
                if(currentPos==7)
                    com_prob=max_score;
                if(currentPos==9)
                    pps=max_score;
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
                    poor_health=max_score;
                if(currentPos==10)
                    lack_of_focus=max_score;
                if(currentPos==8)
                    trouble_relaxing=max_score;
                if(currentPos==7)
                    com_prob=max_score;
                if(currentPos==9)
                    pps=max_score;
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
            bundle.putInt("poor_health",poor_health);
            bundle.putInt("lack_of_focus",lack_of_focus);
            bundle.putInt("trouble_relaxing",trouble_relaxing);
            bundle.putInt("com_prob",com_prob);
            bundle.putInt("pps",pps);
            bundle.putInt("netative_thoughts",netative_thoughts);
            dsp.setArguments(bundle);
            FragmentTransaction ft= getFragmentManager().beginTransaction();
//            FragmentTransaction.addToBackStack(null);
            ft.replace(R.id.stress_FrameLayout,dsp);
            ft.commit();
//            Todo:
        }else{
                question.setText(strTestModalArrayList.get(currentPos).getQuestion());
                option1Btn.setText(strTestModalArrayList.get(currentPos).getOption1());
                option2Btn.setText(strTestModalArrayList.get(currentPos).getOption2());
                option3Btn.setText(strTestModalArrayList.get(currentPos).getOption3());
                option4Btn.setText(strTestModalArrayList.get(currentPos).getOption4());
                option5Btn.setText(strTestModalArrayList.get(currentPos).getOption5());
        }
    }

    private void getQuizQuestion(ArrayList<DepTestModal> depTestModalArrayList) {
        depTestModalArrayList.add(new DepTestModal(1,"Could you tell us about your sleeping patterns in the last few weeks?","I've been sleeping more than usual", "I've been sleeping less than usual","I've been sleeping more but somewhat usual",
                "I've been sleeping less but somewhat usual","I haven't noticed any changes"));

        depTestModalArrayList.add(new DepTestModal(2,"How often does this happen? (Related to previous question)","Rarely","All the Time","Sometimes","Often","Manytimes"));

        depTestModalArrayList.add(new DepTestModal(3,"How has your appetite pattern been over past few weeks?","I've larger appetite than usual","I've a very smaller appetite than usual","I,ve larger appetite but somewhat usual","I've a smaller appetite but somewhat usual","I haven't noticed any changes"));

        depTestModalArrayList.add(new DepTestModal(4,"How often does this happen? (Related to previous question)","Rarely","All the Time","Sometimes","Often","Manytimes"));

        depTestModalArrayList.add(new DepTestModal(5,"Have you been less active than usual?","A lot","Quite a bit","Somewhat","Maybe a little","Not Really"));

        depTestModalArrayList.add(new DepTestModal(6,"I find it difficult to unwind or relax.","Not at all","Not very often","Maybe, sometimes","Most of the time","All the time"));

        depTestModalArrayList.add(new DepTestModal(7,"When I'm stressed, I find it difficult to focus","Strongly disagree","disagree","Neutral","Agree","Strongly agree"));

        depTestModalArrayList.add(new DepTestModal(8,"I feel stressed When I am faced with a problem or have to make a decision","Not at all","Not very often","Maybe, sometimes","Most of the time","All the time"));

        depTestModalArrayList.add(new DepTestModal(9,"I find it difficult to communicate ny opinions or needs to others","Completely untrue","Somewhat untrue","I am unsure","Somewhat true","Completely true"));

        depTestModalArrayList.add(new DepTestModal(10,"I tend to have a negative perspective on things.","Not at all","Not very often","Maybe, sometimes","Most of the time","All the time"));

        depTestModalArrayList.add(new DepTestModal(11,"I find it hard to fulfill both work and personal responsibilities.","Strongly disagree","Disagree","Neutral","Agree","Strongly agree"));

        depTestModalArrayList.add(new DepTestModal(12,"I find it hard to take care of my  health when I'm stressed.","Not at all","Not very often","Maybe, sometimes","Most of the time","All the time"));

        depTestModalArrayList.add(new DepTestModal(13,"Do you think stress gets in a way of your work, relationships, or personal life ?.","No, Never","Rarely","Yes, sometimes","Yes, often","Always"));
    }
}