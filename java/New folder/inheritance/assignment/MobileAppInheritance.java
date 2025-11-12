package inheritance;

//Parent Class
class MobileApp {
 
 String appName;
 String version;
 String developer;
 int downloads;
 double rating;

 // Default constructor
 MobileApp() {
     this.appName = "Default App";
     this.version = "1.0";
     this.developer = "Default Developer";
     this.downloads = 1000;
     this.rating = 4.5;
 } // default constructor ends here

 // Parameterized constructor
 MobileApp(String appName, String version, String developer, int downloads, double rating) {
     this.appName = appName;
     this.version = version;
     this.developer = developer;
     this.downloads = downloads;
     this.rating = rating;
 } // parameterized constructor ends here

 // Getters and Setters
 public String getAppName() {
     return appName;
 }

 public void setAppName(String appName) {
     this.appName = appName;
 }

 public String getVersion() {
     return version;
 }

 public void setVersion(String version) {
     this.version = version;
 }

 public String getDeveloper() {
     return developer;
 }

 public void setDeveloper(String developer) {
     this.developer = developer;
 }

 public int getDownloads() {
     return downloads;
 }

 public void setDownloads(int downloads) {
     this.downloads = downloads;
 }

 public double getRating() {
     return rating;
 }

 public void setRating(double rating) {
     this.rating = rating;
 }

 // Display method
 void display() {
     System.out.println("\n--- Mobile App Details ---");
     System.out.println("App Name   : " + appName);
     System.out.println("Version    : " + version);
     System.out.println("Developer  : " + developer);
     System.out.println("Downloads  : " + downloads);
     System.out.println("Rating     : " + rating);
 } // display ends here
} // MobileApp class ends here


//Child Class 1: GamingApp
class GamingApp extends MobileApp {
 String genre;
 int noOfLevels;
 boolean multiplayerEnabled;

 public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public int getNoOfLevels() {
	return noOfLevels;
}

public void setNoOfLevels(int noOfLevels) {
	this.noOfLevels = noOfLevels;
}

public boolean isMultiplayerEnabled() {
	return multiplayerEnabled;
}

public void setMultiplayerEnabled(boolean multiplayerEnabled) {
	this.multiplayerEnabled = multiplayerEnabled;
}

// Default constructor
 GamingApp() {
     super(); // Calls parent class default constructor
     this.genre = "Action";
     this.noOfLevels = 10;
     this.multiplayerEnabled = true;
 }

 // Parameterized constructor
 GamingApp(String appName, String version, String developer, int downloads, double rating,
           String genre, int noOfLevels, boolean multiplayerEnabled) {
     super(appName, version, developer, downloads, rating); // Calls parent parameterized constructor
     this.genre = genre;
     this.noOfLevels = noOfLevels;
     this.multiplayerEnabled = multiplayerEnabled;
 }

 // Display method
 void display() {
     super.display(); // Show parent details
     System.out.println("Genre               : " + genre);
     System.out.println("Number of Levels    : " + noOfLevels);
     System.out.println("Multiplayer Enabled : " + multiplayerEnabled);
 }
} // GamingApp ends here


//Child Class 2: ShoppingApp
class ShoppingApp extends MobileApp {
 int noOfProducts;
 boolean hasWishlist;
 int totalSellers;

 public int getNoOfProducts() {
	return noOfProducts;
}

public void setNoOfProducts(int noOfProducts) {
	this.noOfProducts = noOfProducts;
}

public boolean isHasWishlist() {
	return hasWishlist;
}

public void setHasWishlist(boolean hasWishlist) {
	this.hasWishlist = hasWishlist;
}

public int getTotalSellers() {
	return totalSellers;
}

public void setTotalSellers(int totalSellers) {
	this.totalSellers = totalSellers;
}

// Default constructor
 ShoppingApp() {
     super();
     this.noOfProducts = 5000;
     this.hasWishlist = true;
     this.totalSellers = 300;
 }

 // Parameterized constructor
 ShoppingApp(String appName, String version, String developer, int downloads, double rating,
             int noOfProducts, boolean hasWishlist, int totalSellers) {
     super(appName, version, developer, downloads, rating);
     this.noOfProducts = noOfProducts;
     this.hasWishlist = hasWishlist;
     this.totalSellers = totalSellers;
 }

 // Display method
 void display() {
     super.display();
     System.out.println("Number of Products : " + noOfProducts);
     System.out.println("Has Wishlist       : " + hasWishlist);
     System.out.println("Total Sellers      : " + totalSellers);
 }
} // ShoppingApp ends here


//Child Class 3: EducationApp
class EducationApp extends MobileApp {
 int noOfCourses;
 int instructorCount;
 boolean certificateAvailable;

 public int getNoOfCourses() {
	return noOfCourses;
}

public void setNoOfCourses(int noOfCourses) {
	this.noOfCourses = noOfCourses;
}

public int getInstructorCount() {
	return instructorCount;
}

public void setInstructorCount(int instructorCount) {
	this.instructorCount = instructorCount;
}

public boolean isCertificateAvailable() {
	return certificateAvailable;
}

public void setCertificateAvailable(boolean certificateAvailable) {
	this.certificateAvailable = certificateAvailable;
}

// Default constructor
 EducationApp() {
     super();
     this.noOfCourses = 20;
     this.instructorCount = 5;
     this.certificateAvailable = true;
 }

 // Parameterized constructor
 EducationApp(String appName, String version, String developer, int downloads, double rating,
              int noOfCourses, int instructorCount, boolean certificateAvailable) {
     super(appName, version, developer, downloads, rating);
     this.noOfCourses = noOfCourses;
     this.instructorCount = instructorCount;
     this.certificateAvailable = certificateAvailable;
 }

 // Display method
 void display() {
     super.display();
     System.out.println("Number of Courses        : " + noOfCourses);
     System.out.println("Number of Instructors    : " + instructorCount);
     System.out.println("Certificate Available    : " + certificateAvailable);
 }
} // EducationApp ends here


//Main class 
public class MobileAppInheritance {
 public static void main(String[] args) {
     GamingApp game = new GamingApp("Clash of Heroes", "2.5", "EpicGames", 500000, 4.8, "Strategy", 50, true);
     ShoppingApp shop = new ShoppingApp("ShopEasy", "1.9", "TechCart", 200000, 4.3, 12000, true, 1500);
     EducationApp edu = new EducationApp("LearnPro", "3.0", "EduCorp", 300000, 4.7, 100, 25, true);

     game.display();
     shop.display();
     edu.display();
 }
} // main class ends here

