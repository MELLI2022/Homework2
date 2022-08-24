public class Main {
    public static void main(String[] args)
    { //Задание 1 (Задачи 1-3)
        { var dog=8.0;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);

        dog = dog+4;
        System.out.println(dog);
        cat = cat+4;
        System.out.println(cat);
        paper = paper+4;
        System.out.println(paper);


        dog = dog-3.5;
        System.out.println(dog);
        cat = cat-1.6;
        System.out.println(cat);
        paper = paper-7639;
        System.out.println(paper);}

//Задача 4
        { var friend = 19;
        System.out.println(friend);
        friend = friend+2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);}

//Задача 5
        { var frog=3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog+4;
        System.out.println(frog);}

// Задача 6
        { var boxerWeight1=78.2;
        var boxerWeight2=82.7;
        var totalWeight = boxerWeight1+boxerWeight2;
        System.out.println(totalWeight);
        var differenceBetweenWeight = boxerWeight2-boxerWeight1;
        System.out.println(differenceBetweenWeight);}

 // Задача 7
        { var boxerWeight1=78.2;
            var boxerWeight2=82.7;
            var differenceBetweenWeight = boxerWeight2-boxerWeight1;
            System.out.println(differenceBetweenWeight);

            var difference = (boxerWeight2%boxerWeight1);
            System.out.println(difference);

        }
// Задача 8
        {var officeHour = 640;
            var workingHour = 8;
            var allPeople = officeHour/workingHour;
            System.out.println("Всего работников в компании - " + allPeople+ " человек");

            var morePeople= workingHour*(allPeople+94);
            System.out.println("Если в компании работает "+(allPeople+94)+" человек, то всего "+morePeople+" часов работы может быть поделено между сотрудниками");



        }








    }
}