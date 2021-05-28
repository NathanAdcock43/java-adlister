import java.io.Serializable;
import java.util.Date;

public class Quote {

    public class Ouote implements Serializable {
        private int id;
        private String AuthorFirstName;
        private String AuthorLastName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAuthorFirstName() {
            return AuthorFirstName;
        }

        public void setAuthorFirstName(String authorFirstName) {
            AuthorFirstName = authorFirstName;
        }

        public String getAuthorLastName() {
            return AuthorLastName;
        }

        public void setAuthorLastName(String authorLastName) {
            AuthorLastName = authorLastName;
        }

        public String getComments() {
            return Comments;
        }

        public void setComments(String comments) {
            Comments = comments;
        }

        private String Comments;

        public Ouote() {  }

        // getters and setters
    }
}
