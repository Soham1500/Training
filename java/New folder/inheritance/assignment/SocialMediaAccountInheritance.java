package inheritance;

//Parent Class 
class SocialMediaAccount {
    String username;
    String email;
    boolean isPublic;
    boolean isVerified;
    String countryOrigin;
    int noOfPost;
    int likes;
    int noOfComments;
    

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public String getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	public int getNoOfPost() {
		return noOfPost;
	}

	public void setNoOfPost(int noOfPost) {
		this.noOfPost = noOfPost;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getNoOfComments() {
		return noOfComments;
	}

	public void setNoOfComments(int noOfComments) {
		this.noOfComments = noOfComments;
	}

	// Default Constructor
    SocialMediaAccount() {
        this.username = "default_user";
        this.email = "default@example.com";
        this.isPublic = true;
        this.isVerified = false;
        this.countryOrigin = "India";
        this.noOfPost = 10;
        this.likes = 100;
        this.noOfComments = 20;
    } // default constructor ends here

    // Parameterized Constructor
    SocialMediaAccount(String username, String email, boolean isPublic, boolean isVerified,
                       String countryOrigin, int noOfPost, int likes, int noOfComments) {
        this.username = username;
        this.email = email;
        this.isPublic = isPublic;
        this.isVerified = isVerified;
        this.countryOrigin = countryOrigin;
        this.noOfPost = noOfPost;
        this.likes = likes;
        this.noOfComments = noOfComments;
    } // parameterized constructor ends here

    // Display Function
    void display() {
        System.out.println("\n--- Social Media Account Details ---");
        System.out.println("Username          : " + username);
        System.out.println("Email             : " + email);
        System.out.println("Public Account    : " + isPublic);
        System.out.println("Verified Account  : " + isVerified);
        System.out.println("Country of Origin : " + countryOrigin);
        System.out.println("Number of Posts   : " + noOfPost);
        System.out.println("Total Likes       : " + likes);
        System.out.println("Total Comments    : " + noOfComments);
    } // display ends here
} // SocialMediaAccount class ends here


// Child Class 1: Instagram
class InstagramAccount extends SocialMediaAccount {
    int noOfFollowers;
    int following;
    int noOfPostArchived;
    int storiesArchived;
    int noOfAudioSaved;

    public int getNoOfFollowers() {
		return noOfFollowers;
	}

	public void setNoOfFollowers(int noOfFollowers) {
		this.noOfFollowers = noOfFollowers;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}

	public int getNoOfPostArchived() {
		return noOfPostArchived;
	}

	public void setNoOfPostArchived(int noOfPostArchived) {
		this.noOfPostArchived = noOfPostArchived;
	}

	public int getStoriesArchived() {
		return storiesArchived;
	}

	public void setStoriesArchived(int storiesArchived) {
		this.storiesArchived = storiesArchived;
	}

	public int getNoOfAudioSaved() {
		return noOfAudioSaved;
	}

	public void setNoOfAudioSaved(int noOfAudioSaved) {
		this.noOfAudioSaved = noOfAudioSaved;
	}

	// Default Constructor
    InstagramAccount() {
        super(); // Calls parent default constructor
        this.noOfFollowers = 1000;
        this.following = 200;
        this.noOfPostArchived = 15;
        this.storiesArchived = 30;
        this.noOfAudioSaved = 50;
    } // default constructor ends here

    // Parameterized Constructor
    InstagramAccount(String username, String email, boolean isPublic, boolean isVerified,
                     String countryOrigin, int noOfPost, int likes, int noOfComments,
                     int noOfFollowers, int following, int noOfPostArchived,
                     int storiesArchived, int noOfAudioSaved) {

        super(username, email, isPublic, isVerified, countryOrigin, noOfPost, likes, noOfComments);
        this.noOfFollowers = noOfFollowers;
        this.following = following;
        this.noOfPostArchived = noOfPostArchived;
        this.storiesArchived = storiesArchived;
        this.noOfAudioSaved = noOfAudioSaved;
    } // parameterized constructor ends here

    // Display Function
    void display() {
        super.display();
        System.out.println("Followers         : " + noOfFollowers);
        System.out.println("Following         : " + following);
        System.out.println("Posts Archived    : " + noOfPostArchived);
        System.out.println("Stories Archived  : " + storiesArchived);
        System.out.println("Audios Saved      : " + noOfAudioSaved);
    } // display ends here
} // InstagramAccount class ends here


// Child Class 2: LinkedIn
class LinkedIn extends SocialMediaAccount {
    int noOfProfileViews;
    int noOfJobsApplied;
    int totalConnections;

    public int getNoOfProfileViews() {
		return noOfProfileViews;
	}

	public void setNoOfProfileViews(int noOfProfileViews) {
		this.noOfProfileViews = noOfProfileViews;
	}

	public int getNoOfJobsApplied() {
		return noOfJobsApplied;
	}

	public void setNoOfJobsApplied(int noOfJobsApplied) {
		this.noOfJobsApplied = noOfJobsApplied;
	}

	public int getTotalConnections() {
		return totalConnections;
	}

	public void setTotalConnections(int totalConnections) {
		this.totalConnections = totalConnections;
	}

	// Default Constructor
    LinkedIn() {
        super();
        this.noOfProfileViews = 100;
        this.noOfJobsApplied = 20;
        this.totalConnections = 500;
    }

    // Parameterized Constructor
    LinkedIn(String username, String email, boolean isPublic, boolean isVerified,
             String countryOrigin, int noOfPost, int likes, int noOfComments,
             int noOfProfileViews, int noOfJobsApplied, int totalConnections) {

        super(username, email, isPublic, isVerified, countryOrigin, noOfPost, likes, noOfComments);
        this.noOfProfileViews = noOfProfileViews;
        this.noOfJobsApplied = noOfJobsApplied;
        this.totalConnections = totalConnections;
    }

    // Display
    void display() {
        super.display();
        System.out.println("Profile Views     : " + noOfProfileViews);
        System.out.println("Jobs Applied      : " + noOfJobsApplied);
        System.out.println("Connections       : " + totalConnections);
    }
} // LinkedIn class ends here


//  Child Class 3: YouTube
class YouTube extends SocialMediaAccount {
    int noOfSubscribers;
    boolean isMonetised;
    double estimatedRevenue;

    public int getNoOfSubscribers() {
		return noOfSubscribers;
	}

	public void setNoOfSubscribers(int noOfSubscribers) {
		this.noOfSubscribers = noOfSubscribers;
	}

	public boolean isMonetised() {
		return isMonetised;
	}

	public void setMonetised(boolean isMonetised) {
		this.isMonetised = isMonetised;
	}

	public double getEstimatedRevenue() {
		return estimatedRevenue;
	}

	public void setEstimatedRevenue(double estimatedRevenue) {
		this.estimatedRevenue = estimatedRevenue;
	}

	// Default Constructor
    YouTube() {
        super();
        this.noOfSubscribers = 10000;
        this.isMonetised = true;
        this.estimatedRevenue = 1500.75;
    }

    // Parameterized Constructor
    YouTube(String username, String email, boolean isPublic, boolean isVerified,
            String countryOrigin, int noOfPost, int likes, int noOfComments,
            int noOfSubscribers, boolean isMonetised, double estimatedRevenue) {

        super(username, email, isPublic, isVerified, countryOrigin, noOfPost, likes, noOfComments);
        this.noOfSubscribers = noOfSubscribers;
        this.isMonetised = isMonetised;
        this.estimatedRevenue = estimatedRevenue;
    }

    // Display
    void display() {
        super.display();
        System.out.println("Subscribers       : " + noOfSubscribers);
        System.out.println("Monetised         : " + isMonetised);
        System.out.println("Revenue (in $)    : " + estimatedRevenue);
    }
} // YouTube class ends here


// Main Class 
public class SocialMediaAccountInheritance {
    public static void main(String[] args) {
        System.out.println("=== Default Constructors ===");
        InstagramAccount insta = new InstagramAccount();
        insta.display();

        LinkedIn linkedin = new LinkedIn();
        linkedin.display();

        YouTube yt = new YouTube();
        yt.display();

        System.out.println("\n=== Parameterized Constructors ===");
        InstagramAccount insta2 = new InstagramAccount("soham_ig", "soham@insta.com", true, true, "India", 120, 5000, 800,
                20000, 500, 25, 50, 75);
        insta2.display();

        LinkedIn linkedin2 = new LinkedIn("soham_ln", "soham@linkedin.com", true, true, "India", 80, 1200, 150,
                300, 25, 700);
        linkedin2.display();

        YouTube yt2 = new YouTube("sohamYT", "soham@youtube.com", true, true, "India", 90, 7000, 1200,
                150000, true, 10500.55);
        yt2.display();
    }
}
