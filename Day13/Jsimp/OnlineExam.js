var Questions = new Array(
    "1. The father of C,C++ & Unix is",
    "2. The Open source among following is ",
    "3. Pancake Sorting Algorithm and BASIC Interpreter was written by",
    "4. Larry page and Sergei Brinn are Co-Founders of",
    "5. The first computer to defeat Chess Grandmaster was"
);
NoOfQuestions = Questions.length;
QuestionNo = 0;
selectedAnswer=5;
marks=0
Choosed = false;
Answers = new Array(NoOfQuestions);
CorrectAnswers = new Array(NoOfQuestions);
for (var i = 0 ; i < NoOfQuestions ; i++)
	{
	    Answers[i] = new Array(4);
	}

    // [0][0] [0][1] [0][2] [0][3]
    // [1][0] [1][1] [1][2] [1][3]...

Answers[0][0] = "Forouzan";
Answers[0][1] = "Dennis Ritchie";
Answers[0][2] = "Andrew Tenenbaum";
Answers[0][3] = "Dijkstra";
CorrectAnswers[0] = 2;


Answers[1][0] = "Windows XP";
Answers[1][1] = "Mac OS X";
Answers[1][2] = "Linux Ubuntu";
Answers[1][3] = "Sun Solaris";
CorrectAnswers[1] = 4;

Answers[2][0] = "Steve Jobs";
Answers[2][1] = "Steve William";
Answers[2][2] = "Bill Gates";
Answers[2][3] = "Jerry yang";
CorrectAnswers[2] = 3;


Answers[3][0] = "Yahoo";
Answers[3][1] = "Rediff";
Answers[3][2] = "Google";
Answers[3][3] = "Apple";
CorrectAnswers[3] = 3;

Answers[4][0] = "Chess Zeus";
Answers[4][1] = "Armageddon";
Answers[4][2] = "White Knight";
Answers[4][3] = "Deep Blue";
CorrectAnswers[4] = 4;

function AnswerChoosed(ans) {
    selectedAnswer = ans;   
    Choosed=true; 
}

function nextQuestion() {
    if (Choosed) {
        if (selectedAnswer == CorrectAnswers[QuestionNo]) {
            marks++;
        }
    if (QuestionNo < NoOfQuestions-1) {
        QuestionNo++;
        loadQuestion();
        Choosed=false;
    } else {
        alert("End of Examination \n"+"Marks Are : "+marks+"");
    }
  } else {
      alert("Please Select any option...");
  }
}

function loadQuestion() {
    document.getElementById("Question").innerHTML=Questions[QuestionNo];
    document.getElementById("Option0").innerHTML = "(a) " + Answers[QuestionNo][0];
	document.getElementById("Option1").innerHTML = "(b) " + Answers[QuestionNo][1];
	document.getElementById("Option2").innerHTML = "(c) " + Answers[QuestionNo][2];
	document.getElementById("Option3").innerHTML = "(d) " + Answers[QuestionNo][3];
    document.getElementById("Opt1").checked = false;	
	document.getElementById("Opt2").checked = false;	
	document.getElementById("Opt3").checked = false;	
	document.getElementById("Opt4").checked = false;
}
