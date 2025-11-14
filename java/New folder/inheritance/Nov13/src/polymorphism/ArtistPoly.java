package polymorphism;


class Artist {
 String name;
 int age;
 String nationality;

 // Default constructor
 public Artist() {
     this.name = "Unknown";
     this.age = 0;
     this.nationality = "Unknown";
 }

 // Parameterized constructor
 public Artist(String name, int age, String nationality) {
     this.name = name;
     this.age = age;
     this.nationality = nationality;
 }

 // Behaviors
 void perform() {
     System.out.println(name + " is performing...");
 }

 void practice() {
     System.out.println(name + " is practicing their art...");
 }

 void display() {
     System.out.println("----- Artist Details -----");
     System.out.println("Name        : " + name);
     System.out.println("Age         : " + age);
     System.out.println("Nationality : " + nationality);
     System.out.println("--------------------------");
 }
}


class Singer extends Artist {
 String genre;
 int numberOfAlbums;

 Singer() {}

 Singer(String name, int age, String nationality, String genre, int numberOfAlbums) {
     super(name, age, nationality);
     this.genre = genre;
     this.numberOfAlbums = numberOfAlbums;
 }

 @Override
 void perform() {
     System.out.println( name + " is singing a song in " + genre + " genre!");
 }

 @Override
 void practice() {
     System.out.println(name + " is practicing vocals...");
 }

 @Override
 void display() {
     super.display();
     System.out.println("Genre           : " + genre);
     System.out.println("Number of Albums: " + numberOfAlbums);
     System.out.println("--------------------------");
 }
}


class Painter extends Artist {
 String style;
 int numberOfExhibitions;

 Painter() {}

 Painter(String name, int age, String nationality, String style, int numberOfExhibitions) {
     super(name, age, nationality);
     this.style = style;
     this.numberOfExhibitions = numberOfExhibitions;
 }

 @Override
 void perform() {
     System.out.println( name + " is painting in " + style + " style!");
 }

 @Override
 void practice() {
     System.out.println(name + " is practicing painting techniques...");
 }

 @Override
 void display() {
     super.display();
     System.out.println("Style               : " + style);
     System.out.println("Number of Exhibitions: " + numberOfExhibitions);
     System.out.println("--------------------------");
 }
}


class Actor extends Artist {
 String favoriteRole;
 int numberOfMovies;

 Actor() {}

 Actor(String name, int age, String nationality, String favoriteRole, int numberOfMovies) {
     super(name, age, nationality);
     this.favoriteRole = favoriteRole;
     this.numberOfMovies = numberOfMovies;
 }

 @Override
 void perform() {
     System.out.println(name + " is acting in a role as " + favoriteRole + "!");
 }

 @Override
 void practice() {
     System.out.println(name + " is practicing acting skills...");
 }

 @Override
 void display() {
     super.display();
     System.out.println("Favorite Role : " + favoriteRole);
     System.out.println("Number of Movies: " + numberOfMovies);
     System.out.println("--------------------------");
 }
}


public class ArtistPoly {
 public static void main(String[] args) {
     // Singer
     Singer singer = new Singer("Arijit Singh", 35, "Indian", "Romantic", 25);
     singer.display();
     singer.practice();
     singer.perform();

     System.out.println();

     // Painter
     Painter painter = new Painter("Leonardo da Vinci", 67, "Italian", "Renaissance", 10);
     painter.display();
     painter.practice();
     painter.perform();

     System.out.println();

     // Actor
     Actor actor = new Actor("Leonardo DiCaprio", 48, "American", "Dramatic", 40);
     actor.display();
     actor.practice();
     actor.perform();
 }
}
