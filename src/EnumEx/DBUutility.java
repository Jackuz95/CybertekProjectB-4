package EnumEx;

public class DBUutility {
    Connection connection;
    public void openConnection(DateBase db){
        switch (db){
            case USERS:
                // connection = connect
                // code to connect to our user dc
            case SALES:
                //connection = connect
                // code to connect to sales db
            case MEDIA:
                // connection = connect
                // code to connect to media db
        }

    }

}
