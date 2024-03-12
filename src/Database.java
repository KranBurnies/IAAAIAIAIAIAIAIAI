import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Database {
    private String name;
    private int time;
    private String workType;

    private String subject;



    public Database() {
    }

    public void writeToDatabase(String subjectName, int time, String workType, String subject) {
        this.name = subjectName;
        this.time = time;
        this.workType = workType;
        this.subject = subject;
        try {
            //Writer uses 4 lines; line indexes of 0, 4, 8, etc.
            BufferedWriter writer = new BufferedWriter(new FileWriter("database.txt"));
            writer.write("Name: " + subjectName + "\n");
            writer.write("Time: " + time + "\n");
            writer.write("Work Type: " + workType + "\n");
            writer.write("Subject:" + subject + "/n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    public void readFromDatabase(int itemNumber) {
        
        }
    }
}

// me kran burnies
// me luv stephan
// stephan luv chicken