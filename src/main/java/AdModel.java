public class AdModel {
    private Long Id;
    private String UserName;
    private String Title;
    private String Description;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public AdModel(){};

    public AdModel(Long Id, String UserName, String Title, String Description){
        this.Id = Id;
        this.UserName = UserName;
        this.Title = Title;
       this.Description = Description;
    }

}
