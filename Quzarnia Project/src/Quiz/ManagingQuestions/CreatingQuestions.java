package Quiz.ManagingQuestions;

import Quiz.QuizTopics.Biology.QuestionBiologyEasy;
import Quiz.QuizTopics.Biology.QuestionBiologyHard;
import Quiz.QuizTopics.Biology.QuestionBiologyMedium;
import Quiz.QuizTopics.Computing.QuestionComputingEasy;
import Quiz.QuizTopics.Computing.QuestionComputingHard;
import Quiz.QuizTopics.Computing.QuestionComputingMedium;
import Quiz.QuizTopics.History.QuestionHistoryEasy;
import Quiz.QuizTopics.History.QuestionHistoryHard;
import Quiz.QuizTopics.History.QuestionHistoryMedium;

import java.util.ArrayList;
import java.util.List;

public class CreatingQuestions {
    public  List<QuestionHistoryEasy> questionHistoryEasy = new ArrayList<>();
    public  List<QuestionHistoryMedium> questionHistoryMedium = new ArrayList<>();
    public  List<QuestionHistoryHard> questionHistoryHard = new ArrayList<>();

    public  List<QuestionBiologyEasy> questionBiologyEasy = new ArrayList<>();
    public  List<QuestionBiologyMedium> questionBiologyMedium = new ArrayList<>();
    public  List<QuestionBiologyHard> questionBiologyHard = new ArrayList<>();

    public  List<QuestionComputingEasy> questionComputingEasy = new ArrayList<>();
    public  List<QuestionComputingMedium> questionComputingMedium = new ArrayList<>();
    public  List<QuestionComputingHard> questionComputingHard = new ArrayList<>();



    public CreatingQuestions(){
        List<String> incorrectAnswersQuestion1 = new ArrayList<>();
        incorrectAnswersQuestion1.add("Jon");
        incorrectAnswersQuestion1.add("Obama");
        incorrectAnswersQuestion1.add("Trump");
        questionHistoryEasy.add(new QuestionHistoryEasy("Who is the President of USA?", "Biden", incorrectAnswersQuestion1));

        List<String> incorrectAnswersQuestion2 = new ArrayList<>();
        incorrectAnswersQuestion2.add("Philip");
        incorrectAnswersQuestion2.add("Dan");
        incorrectAnswersQuestion2.add("Bobby");
        questionHistoryEasy.add(new QuestionHistoryEasy("Who is the Queen of England?", "Elizabeth", incorrectAnswersQuestion2));

        List<String> incorrectAnswersQuestion3 = new ArrayList<>();
        incorrectAnswersQuestion3.add("1921");
        incorrectAnswersQuestion3.add("1949");
        incorrectAnswersQuestion3.add("1937");
        questionHistoryEasy.add(new QuestionHistoryEasy("When did USSR Collapsed?", "1991", incorrectAnswersQuestion3));

        List<String> incorrectAnswersQuestion32 = new ArrayList<>();
        incorrectAnswersQuestion32.add("1467");
        incorrectAnswersQuestion32.add("1949");
        incorrectAnswersQuestion32.add("1984");
        questionHistoryEasy.add(new QuestionHistoryEasy("When did WW2 ended?", "1945", incorrectAnswersQuestion32));

        List<String> incorrectAnswersQuestion31 = new ArrayList<>();
        incorrectAnswersQuestion31.add("Prussia");
        incorrectAnswersQuestion31.add("Russia");
        incorrectAnswersQuestion31.add("Burgundy");
        questionHistoryEasy.add(new QuestionHistoryEasy("How was Germany called after WW1", "Weimar Republic", incorrectAnswersQuestion31));

        List<String> incorrectAnswersQuestion311 = new ArrayList<>();
        incorrectAnswersQuestion311.add("41 BC");
        incorrectAnswersQuestion311.add("29 BC");
        incorrectAnswersQuestion311.add("1 AD");
        questionHistoryEasy.add(new QuestionHistoryEasy("When did Julius Caesar died?", "44 BC", incorrectAnswersQuestion311));

        List<String> incorrectAnswersQuestion21 = new ArrayList<>();
        incorrectAnswersQuestion21.add("1923");
        incorrectAnswersQuestion21.add("1934");
        incorrectAnswersQuestion21.add("1965");
        questionHistoryEasy.add(new QuestionHistoryEasy("When did Iron Curtain fell?", "1991", incorrectAnswersQuestion21));

        List<String> incorrectAnswersQuestion212 = new ArrayList<>();
        incorrectAnswersQuestion212.add("100");
        incorrectAnswersQuestion212.add("99");
        incorrectAnswersQuestion212.add("101");
        questionHistoryEasy.add(new QuestionHistoryEasy(
                "How many years did the 'One Hundred Years War' last?", "116", incorrectAnswersQuestion212));

        List<String> incorrectAnswersQuestion2122 = new ArrayList<>();
        incorrectAnswersQuestion2122.add("2001");
        incorrectAnswersQuestion2122.add("2000");
        incorrectAnswersQuestion2122.add("2002");
        questionHistoryEasy.add(new QuestionHistoryEasy(
                "In which year did a US-led coalition invade Iraq?", "2003", incorrectAnswersQuestion2122));

        List<String> incorrectAnswersQuestion111 = new ArrayList<>();
        incorrectAnswersQuestion111.add("1961");
        incorrectAnswersQuestion111.add("1960");
        incorrectAnswersQuestion111.add("2002");
        questionHistoryEasy.add(new QuestionHistoryEasy(
                "In which year was JFK assassinated?", "1963", incorrectAnswersQuestion111));

        List<String> incorrectAnswersQuestion1121 = new ArrayList<>();
        incorrectAnswersQuestion1121.add("7");
        incorrectAnswersQuestion1121.add("6");
        incorrectAnswersQuestion1121.add("9");
        questionHistoryEasy.add(new QuestionHistoryEasy(
                "How many days were there in one week in ancient Roman times", "8", incorrectAnswersQuestion1121));
        List<String> incorrectAnswersQuestion11211 = new ArrayList<>();
        incorrectAnswersQuestion11211.add("Police");
        incorrectAnswersQuestion11211.add("Boy Scout");
        incorrectAnswersQuestion11211.add("Presidents");
        questionHistoryEasy.add(new QuestionHistoryEasy(
                "Which organisation was awarded the Nobel Peace Prize in 1917?", "Red Cross", incorrectAnswersQuestion11211));


        List<String> incorrectAnswersQuestion4 = new ArrayList<>();
        incorrectAnswersQuestion4.add("Austria");
        incorrectAnswersQuestion4.add("Italy");
        incorrectAnswersQuestion4.add("England");
        questionHistoryEasy.add(new QuestionHistoryEasy("Who started WW2?", "Germany", incorrectAnswersQuestion4));


        List<String> incorrectAnswersQuestion44 = new ArrayList<>();
        incorrectAnswersQuestion44.add("5");
        incorrectAnswersQuestion44.add("53");
        incorrectAnswersQuestion44.add("52");
        questionHistoryEasy.add(new QuestionHistoryEasy("How many stars does the American Flag have?", "50", incorrectAnswersQuestion44));
        List<String> incorrectAnswersQuestion444 = new ArrayList<>();
        incorrectAnswersQuestion444.add("Fredrick");
        incorrectAnswersQuestion444.add("Trump");
        incorrectAnswersQuestion444.add("Rossevelt");
        questionHistoryEasy.add(new QuestionHistoryEasy("The first president of the United States of America is?", "George Washington", incorrectAnswersQuestion444));
        //BIOLOGY.......EASY.........................................................................
        List<String> incorrectAnswersQuestion5  = new ArrayList<>();
        incorrectAnswersQuestion5.add("Ka");
        incorrectAnswersQuestion5.add("Ka");
        incorrectAnswersQuestion5.add("Ka");
        questionHistoryHard.add(new QuestionHistoryHard("Ka nx", " asd", incorrectAnswersQuestion5));

        List<String> incorrectAnswersBiologyEasy1 = new ArrayList<>();
        incorrectAnswersBiologyEasy1.add("Stomach");
        incorrectAnswersBiologyEasy1.add("Heart");
        incorrectAnswersBiologyEasy1.add("Lungs");
        questionBiologyEasy.add(new QuestionBiologyEasy("What is the human body’s largest organ?", "Skin", incorrectAnswersBiologyEasy1));

        List<String> incorrectAnswersBiologyEasy2 = new ArrayList<>();
        incorrectAnswersBiologyEasy2.add("Elon Musk");
        incorrectAnswersBiologyEasy2.add("Bill Gates");
        incorrectAnswersBiologyEasy2.add("Jeff Bezos");
        questionBiologyEasy.add(new QuestionBiologyEasy("Who discovered penicillin? ", "Alexander Fleming", incorrectAnswersBiologyEasy2));

        List<String> incorrectAnswersBiologyEasy3 = new ArrayList<>();
        incorrectAnswersBiologyEasy3.add("No");
        incorrectAnswersBiologyEasy3.add("Don’t know");
        incorrectAnswersBiologyEasy3.add("Maybe");
        questionBiologyEasy.add(new QuestionBiologyEasy("Do snails have teeth?", "Yes", incorrectAnswersBiologyEasy3));

        List<String> incorrectAnswersBiologyEasy4 = new ArrayList<>();
        incorrectAnswersBiologyEasy4.add("Animal Cells");
        incorrectAnswersBiologyEasy4.add("Both");
        incorrectAnswersBiologyEasy4.add("None");
        questionBiologyEasy.add(new QuestionBiologyEasy("Can cell walls be found in plant cells, animal cells, None or both?", "Plant Cells", incorrectAnswersBiologyEasy4));

        List<String> incorrectAnswersBiologyEasy5 = new ArrayList<>();
        incorrectAnswersBiologyEasy5.add("True");
        incorrectAnswersBiologyEasy5.add("Maybe");
        incorrectAnswersBiologyEasy5.add("Perhaps");
        questionBiologyEasy.add(new QuestionBiologyEasy("True or false: Jellyfish have hearts", "False", incorrectAnswersBiologyEasy5));

        List<String> incorrectAnswersBiologyEasy6 = new ArrayList<>();
        incorrectAnswersBiologyEasy6.add("Pelvis");
        incorrectAnswersBiologyEasy6.add("Chest");
        incorrectAnswersBiologyEasy6.add("Spine");
        questionBiologyEasy.add(new QuestionBiologyEasy("What part of the human body includes the jawbone?", "Skull", incorrectAnswersBiologyEasy6));


        List<String> incorrectAnswersBiologyEasy7 = new ArrayList<>();
        incorrectAnswersBiologyEasy7.add("Jaguar");
        incorrectAnswersBiologyEasy7.add("Leopard");
        incorrectAnswersBiologyEasy7.add("Tiger");
        questionBiologyEasy.add(new QuestionBiologyEasy("What animal is the alpha male in the wild?", "Lion", incorrectAnswersBiologyEasy7));

        List<String> incorrectAnswersQuestion8 = new ArrayList<>();
        incorrectAnswersQuestion8.add("The Wind");
        incorrectAnswersQuestion8.add("The Stars");
        incorrectAnswersQuestion8.add("The Moon");
        questionBiologyEasy.add(new QuestionBiologyEasy("What is 1 of the integral parts for plants to grow?", "The Sun", incorrectAnswersQuestion8));

        List<String> incorrectAnswersBiologyEasy9 = new ArrayList<>();
        incorrectAnswersBiologyEasy9.add("Three");
        incorrectAnswersBiologyEasy9.add("Two");
        incorrectAnswersBiologyEasy9.add("One");
        questionBiologyEasy.add(new QuestionBiologyEasy("How many legs does a snake have?", "Zero", incorrectAnswersBiologyEasy9));

        List<String> incorrectAnswersBiologyEasy10 = new ArrayList<>();
        incorrectAnswersBiologyEasy10.add("Vipers");
        incorrectAnswersBiologyEasy10.add("Rulers");
        incorrectAnswersBiologyEasy10.add("Big dogs");
        questionBiologyEasy.add(new QuestionBiologyEasy("What are lions also known as?", "Big cats", incorrectAnswersBiologyEasy10));

        List<String> incorrectAnswersBiologyEasy11 = new ArrayList<>();
        incorrectAnswersBiologyEasy11.add("Culturalization");
        incorrectAnswersBiologyEasy11.add("Explosion");
        incorrectAnswersBiologyEasy11.add("Expansion");
        questionBiologyEasy.add(new QuestionBiologyEasy("The death of every member of a particular species is known as what?", "Extinction", incorrectAnswersBiologyEasy11));

        List<String> incorrectAnswersBiologyEasy12 = new ArrayList<>();
        incorrectAnswersBiologyEasy12.add("Physicist");
        incorrectAnswersBiologyEasy12.add("Psychologist");
        incorrectAnswersBiologyEasy12.add("Chemist");
        questionBiologyEasy.add(new QuestionBiologyEasy("A person who studies biology is known as what?", "Biologist", incorrectAnswersBiologyEasy12));

        List<String> incorrectAnswersBiologyEasy13 = new ArrayList<>();
        incorrectAnswersBiologyEasy13.add("True");
        incorrectAnswersBiologyEasy13.add("Maybe");
        incorrectAnswersBiologyEasy13.add("Perhaps");
        questionBiologyEasy.add(new QuestionBiologyEasy("True or false? A salamander is a warm blooded animal.", "False", incorrectAnswersBiologyEasy13));

        List<String> incorrectAnswersBiologyEasy14 = new ArrayList<>();
        incorrectAnswersBiologyEasy14.add("Organisation");
        incorrectAnswersBiologyEasy14.add("Solid state");
        incorrectAnswersBiologyEasy14.add("Repetition");
        questionBiologyEasy.add(new QuestionBiologyEasy("A change of the DNA in an organism that results in a new trait is known as a?", "Mutation", incorrectAnswersBiologyEasy14));

        List<String> incorrectAnswersBiologyEasy15 = new ArrayList<>();
        incorrectAnswersBiologyEasy15.add("False");
        incorrectAnswersBiologyEasy15.add("Maybe");
        incorrectAnswersBiologyEasy15.add("Perhaps");
        questionBiologyEasy.add(new QuestionBiologyEasy("True or false? The common cold is caused by a virus ", "True", incorrectAnswersBiologyEasy15));

        //BIOLOGY........MEDIUM.........................................

        List<String> incorrectAnswersBiologyMedium1 = new ArrayList<>();
        incorrectAnswersBiologyEasy1.add("Lymphocytes");
        incorrectAnswersBiologyEasy1.add("Plasma");
        incorrectAnswersBiologyEasy1.add("Gammer");
        questionBiologyMedium.add(new QuestionBiologyMedium("White blood cells are called?", "Leucocytes", incorrectAnswersBiologyMedium1));

        List<String> incorrectAnswersBiologyMedium2 = new ArrayList<>();
        incorrectAnswersQuestion2.add("Heart");
        incorrectAnswersQuestion2.add("Lower trunk");
        incorrectAnswersQuestion2.add("Legs");
        questionBiologyMedium.add(new QuestionBiologyMedium("Which of the following organs do the pulmonary arteries service?", "Lungs", incorrectAnswersBiologyMedium2));

        List<String> incorrectAnswersBiologyMedium3 = new ArrayList<>();
        incorrectAnswersQuestion3.add("Pollen Tube");
        incorrectAnswersQuestion3.add("Nectar");
        incorrectAnswersQuestion3.add("Zygote");
        questionBiologyMedium.add(new QuestionBiologyMedium("Which of the following nourishes a developing seed?", "Endosperm", incorrectAnswersBiologyMedium3));

        List<String> incorrectAnswersBiologyMedium4 = new ArrayList<>();
        incorrectAnswersBiologyMedium4.add("Urea");
        incorrectAnswersBiologyMedium4.add("Ammonia");
        incorrectAnswersBiologyMedium4.add("Uric Acid");
        questionBiologyMedium.add(new QuestionBiologyMedium("Which of the following is NOT a nitrogenous waste compound excreted by animals?", "Pyridine", incorrectAnswersBiologyMedium4));

        List<String> incorrectAnswersBiologyMedium5 = new ArrayList<>();
        incorrectAnswersBiologyMedium5.add("Cancer");
        incorrectAnswersBiologyMedium5.add("Chicken Pox");
        incorrectAnswersBiologyMedium5.add("Influenza");
        questionBiologyMedium.add(new QuestionBiologyMedium("Hansen’s disease is more commonly known by which name?", "Leprosy", incorrectAnswersBiologyMedium5));

        List<String> incorrectAnswersBiologyMedium6 = new ArrayList<>();
        incorrectAnswersBiologyMedium6.add("Bacteria");
        incorrectAnswersBiologyMedium6.add("Archaea");
        incorrectAnswersBiologyMedium6.add("Fungi");
        questionBiologyMedium.add(new QuestionBiologyMedium("Botany is the study of what life form?", "Plants", incorrectAnswersBiologyMedium6));


        List<String> incorrectAnswersBiologyMedium7 = new ArrayList<>();
        incorrectAnswersBiologyMedium7.add("Amphibians");
        incorrectAnswersBiologyMedium7.add("Dinosaurs");
        incorrectAnswersBiologyMedium7.add("Reptiles");
        questionBiologyMedium.add(new QuestionBiologyMedium("What species are humans classed as?", "Homo Sapiens", incorrectAnswersBiologyMedium7));

        List<String> incorrectAnswersBiologyMedium8 = new ArrayList<>();
        incorrectAnswersBiologyMedium8.add("Process to grow");
        incorrectAnswersBiologyMedium8.add("Support");
        incorrectAnswersBiologyMedium8.add("Nutrients");
        questionBiologyMedium.add(new QuestionBiologyMedium("Why do plants need soil?", "All of the above", incorrectAnswersBiologyMedium8));

        List<String> incorrectAnswersBiologyMedium9 = new ArrayList<>();
        incorrectAnswersBiologyMedium9.add("Square");
        incorrectAnswersBiologyMedium9.add("Helix");
        incorrectAnswersBiologyMedium9.add("Octagon");
        questionBiologyMedium.add(new QuestionBiologyMedium("A DNA molecule is described as being what shape?", "Double helix", incorrectAnswersBiologyMedium9));

        List<String> incorrectAnswersBiologyMedium10 = new ArrayList<>();
        incorrectAnswersBiologyMedium10.add("Ten");
        incorrectAnswersBiologyMedium10.add("Eight");
        incorrectAnswersBiologyMedium10.add("Six");
        questionBiologyMedium.add(new QuestionBiologyMedium("How many neck vertebrae do giraffes have, compared to a human’s seven?", "Seven", incorrectAnswersBiologyMedium10));

        List<String> incorrectAnswersBiologyMedium11 = new ArrayList<>();
        incorrectAnswersBiologyMedium11.add("Protein");
        incorrectAnswersBiologyMedium11.add("Mineral");
        incorrectAnswersBiologyMedium11.add("Vitamin");
        questionBiologyMedium.add(new QuestionBiologyMedium("Which food substance helps move waste through the body?", "Fibre", incorrectAnswersBiologyMedium11));

        List<String> incorrectAnswersBiologyMedium12 = new ArrayList<>();
        incorrectAnswersBiologyMedium12.add("Louis Pasteur");
        incorrectAnswersBiologyMedium12.add("Gregor Mendel");
        incorrectAnswersBiologyMedium12.add("James Watson");
        questionBiologyMedium.add(new QuestionBiologyMedium("Which famous scientist introduced the idea of natural selection?", "Charles Darwin", incorrectAnswersBiologyMedium12));

        List<String> incorrectAnswersBiologyMedium13 = new ArrayList<>();
        incorrectAnswersBiologyMedium13.add("Vegetarians");
        incorrectAnswersBiologyMedium13.add("Carnivores");
        incorrectAnswersBiologyMedium13.add("Herbivores");
        questionBiologyMedium.add(new QuestionBiologyMedium("Animals which eat both plants and other animals are known as what?", "Omnivores", incorrectAnswersBiologyMedium13));

        List<String> incorrectAnswersBiologyMedium14 = new ArrayList<>();
        incorrectAnswersBiologyMedium14.add("Biotis");
        incorrectAnswersBiologyMedium14.add("Anticbiotis");
        incorrectAnswersBiologyMedium14.add("Biotics");
        questionBiologyMedium.add(new QuestionBiologyMedium("Bacterial infections in humans can be treated with what?", "Antibiotics", incorrectAnswersBiologyMedium14));

        List<String> incorrectAnswersBiologyMedium15 = new ArrayList<>();
        incorrectAnswersBiologyMedium15.add("Garbage");
        incorrectAnswersBiologyMedium15.add("Rubbish");
        incorrectAnswersBiologyMedium15.add("Trash");
        questionBiologyMedium.add(new QuestionBiologyMedium("A group of dog offspring is known as a?", "Litter", incorrectAnswersBiologyMedium15));


        //BIOLOGY..........................HARD>.......
        List<String> incorrectAnswersQuestion1111 = new ArrayList<>();
        incorrectAnswersQuestion1111.add("The Shoulder Blades");
        incorrectAnswersQuestion1111.add("The Shin Bones");
        incorrectAnswersQuestion1111.add("None of the above");
        questionBiologyHard.add(new QuestionBiologyHard("The clavicles are the bones commonly referred to as what?", "The Collar Bones","1 of the bones", incorrectAnswersQuestion1111));
        List<String> incorrectAnswersQuestion222 = new ArrayList<>();
        incorrectAnswersQuestion222.add("201");
        incorrectAnswersQuestion222.add("203");
        incorrectAnswersQuestion222.add("188");
        questionBiologyHard.add(new QuestionBiologyHard("How many bones does an adult human have?", "206", "Above 200",incorrectAnswersQuestion222));


        List<String> incorrectAnswersQuestion333 = new ArrayList<>();
        incorrectAnswersQuestion333.add("Charles Chamberland");
        incorrectAnswersQuestion333.add("Emmanuelle Charpentier");
        incorrectAnswersQuestion333.add("Agnes Ullmann");
        questionBiologyHard.add(new QuestionBiologyHard("Which French microbiologist discovered the process of pasteurisation?", "Louis Pasteur","1 of the males", incorrectAnswersQuestion333));



        List<String> incorrectAnswersQuestion4444 = new ArrayList<>();
        incorrectAnswersQuestion4444.add("1995");
        incorrectAnswersQuestion4444.add("2001");
        incorrectAnswersQuestion4444.add("1990");
        questionBiologyHard.add(new QuestionBiologyHard("What year was the first animal cloned?", "1996","Tom Holland and Zendaya was born on the same year", incorrectAnswersQuestion4444));


        List<String> incorrectAnswersQuestion555 = new ArrayList<>();
        incorrectAnswersQuestion555.add("Dani");
        incorrectAnswersQuestion555.add("Bobby");
        incorrectAnswersQuestion555.add("Daisy");
        questionBiologyHard.add(new QuestionBiologyHard("What was the name of first animal called?", "Dolly","The name starts with a D", incorrectAnswersQuestion555));


        List<String> incorrectAnswersQuestion6 = new ArrayList<>();
        incorrectAnswersQuestion6.add("Cat");
        incorrectAnswersQuestion6.add("Cow");
        incorrectAnswersQuestion6.add("Goat");
        questionBiologyHard.add(new QuestionBiologyHard("What species was the first animal cloned?", "Sheep","1 of the farmyard animals", incorrectAnswersQuestion6));


        List<String> incorrectAnswersQuestion7 = new ArrayList<>();
        incorrectAnswersQuestion7.add("8 million");
        incorrectAnswersQuestion7.add("5 million");
        incorrectAnswersQuestion7.add("10 million");
        questionBiologyHard.add(new QuestionBiologyHard("How many species are estimated to live on Earth?", "8.7 million","Over 5 million, lower than 10 million", incorrectAnswersQuestion7));

        List<String> incorrectAnswersQuestion888 = new ArrayList<>();
        incorrectAnswersQuestion888.add("Different shaped ears");
        incorrectAnswersQuestion888.add("Different sized feet");
        incorrectAnswersQuestion888.add("Different sized arms");
        questionBiologyHard.add(new QuestionBiologyHard("Heterochromia results in which change in physical appearance?", "Different coloured eyes","Note the word Chrome in Heterochromia", incorrectAnswersQuestion888));

        List<String> incorrectAnswersQuestion9 = new ArrayList<>();
        incorrectAnswersQuestion9.add("Intestines");
        incorrectAnswersQuestion9.add("Bladder");
        incorrectAnswersQuestion9.add("Lungs");
        questionBiologyHard.add(new QuestionBiologyHard("The term ‘renal’ refers to which organs?", "Kidneys","The name starts with a D", incorrectAnswersQuestion9));


        List<String> incorrectAnswersQuestion10 = new ArrayList<>();
        incorrectAnswersQuestion10.add("Cerebellum");
        incorrectAnswersQuestion10.add("Brainstem");
        incorrectAnswersQuestion10.add("Midbrain");
        questionBiologyHard.add(new QuestionBiologyHard("What is the name of the biggest part of the human brain?", "Cerebrum","1 of the farmyard animal", incorrectAnswersQuestion10));

        List<String> incorrectAnswersQuestion11 = new ArrayList<>();
        incorrectAnswersQuestion11.add("180,000 miles per second");
        incorrectAnswersQuestion11.add("186,000 miles per hour");
        incorrectAnswersQuestion11.add("18,000 miles per second");
        questionBiologyHard.add(new QuestionBiologyHard("At what speed does light travel?", "186,000 miles per second","The Midbrain is part of the Brainstem", incorrectAnswersQuestion11));

        List<String> incorrectAnswersQuestion12 = new ArrayList<>();
        incorrectAnswersQuestion12.add("Iapetus");
        incorrectAnswersQuestion12.add("Enceladus");
        incorrectAnswersQuestion12.add("Mimas");
        questionBiologyHard.add(new QuestionBiologyHard("What is the largest moon of Saturn called?", "Titan","Over 100,000", incorrectAnswersQuestion12));

        List<String> incorrectAnswersQuestion13 = new ArrayList<>();
        incorrectAnswersQuestion13.add("85");
        incorrectAnswersQuestion13.add("100");
        incorrectAnswersQuestion13.add("80");
        questionBiologyHard.add(new QuestionBiologyHard("How many moons does Saturn?", "82","The answer is in its name", incorrectAnswersQuestion13));

        List<String> incorrectAnswersQuestion14 = new ArrayList<>();
        incorrectAnswersQuestion14.add("20");
        incorrectAnswersQuestion14.add("23");
        incorrectAnswersQuestion14.add("50");
        questionBiologyHard.add(new QuestionBiologyHard("How many ribs does a human have?", "24","The answer is in the single digits", incorrectAnswersQuestion14));

        List<String> incorrectAnswersQuestion15 = new ArrayList<>();
        incorrectAnswersQuestion15.add("The sound");
        incorrectAnswersQuestion15.add("The taste");
        incorrectAnswersQuestion15.add("The sight");
        questionBiologyHard.add(new QuestionBiologyHard("Which is the most sensitive of the senses?", "The smell", "The answer is an even number",incorrectAnswersQuestion15));




        List<String> incorrectAnswersQuestion100 = new ArrayList<>();
        incorrectAnswersQuestion15.add("Television");
        incorrectAnswersQuestion15.add("Ram ");
        incorrectAnswersQuestion15.add("Motherboard ");
        questionComputingEasy.add(new QuestionComputingEasy("Which is the most sensitive of the senses?", "•Laptop ", incorrectAnswersQuestion100));



    }

    public List<QuestionHistoryEasy> getQuestionsHistoryEasy() {
        return questionHistoryEasy;
    }
    public List<QuestionHistoryMedium> getQuestionsHistoryMedium() {
        return questionHistoryMedium;
    }

    public List<QuestionHistoryHard> getQuestionsHistoryHard() {
        return questionHistoryHard;
    }

    public List<QuestionBiologyEasy> getQuestionBiologyEasy() {
        return questionBiologyEasy;
    }
    public List<QuestionBiologyMedium> getQuestionBiologyMedium() {
        return questionBiologyMedium;
    }
    public List<QuestionBiologyHard> getQuestionBiologyHard() {
        return questionBiologyHard;
    }

}
