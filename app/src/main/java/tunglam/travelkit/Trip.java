package tunglam.travelkit;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by User on 11/24/2017.
 */
@IgnoreExtraProperties
public class Trip {
    private String  tripId;
    private String tripName;


    public Trip(){
        //this constructor is required
    }

    public Trip(String tripId, String tripName) {
        this.tripId = tripId;
        this.tripName = tripName;

    }

    public String getTripId() {
        return tripId;
    }

    public String getTripName() {
        return tripName;
    }


}
