import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
public class FlightInfo implements Serializable {
    private String date;
    private String time;
    Airplane airplane ;
    Route r = new Route();
    public static List<Airplane> ar = new ArrayList();
    
    public void setSchedule() {
        ar.add(r.Incheon_Tokyo_Large("2019/4/6", "09:00"));
        ar.add(r.Incheon_Tokyo_Medium("2019/4/6", "10:00"));
        ar.add(r.Incheon_Tokyo_Small("2019/4/6", "11:00"));
        ar.add(r.Incheon_London_Large("2019/4/6", "12:00"));
        ar.add(r.Incheon_London_Large("2019/4/6", "13:00"));
        ar.add(r.Incheon_London_Large("2019/4/6", "14:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/06", "15:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/06", "16:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/06", "17:00"));
        
        ar.add(r.Incheon_Toronto_Large("2019/04/06", "18:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/06", "19:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/06", "20:00"));
        
        ar.add(r.Incheon_Tokyo_Large("2019/04/07", "09:00"));
        ar.add(r.Incheon_Tokyo_Medium("2019/04/07", "10:00"));
        ar.add(r.Incheon_Tokyo_Small("2019/04/07", "11:00"));
        ar.add(r.Incheon_London_Large("2019/04/07", "12:00"));
        ar.add(r.Incheon_London_Large("2019/04/07", "13:00"));
        ar.add(r.Incheon_London_Large("2019/04/07", "14:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/07", "15:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/07", "16:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/07", "17:00"));
        
        ar.add(r.Incheon_Toronto_Large("2019/04/07", "18:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/07", "19:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/07", "20:00"));
        
        ar.add(r.Incheon_Tokyo_Large("2019/04/08", "09:00"));
        ar.add(r.Incheon_Tokyo_Medium("2019/04/08", "10:00"));
        ar.add(r.Incheon_Tokyo_Small("2019/04/08", "11:00"));
        ar.add(r.Incheon_London_Large("2019/04/08", "12:00"));
        ar.add(r.Incheon_London_Large("2019/04/08", "13:00"));
        ar.add(r.Incheon_London_Large("2019/04/08", "14:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/08", "15:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/08", "16:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/08", "17:00"));
        
        ar.add(r.Incheon_Toronto_Large("2019/04/08", "18:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/08", "19:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/08", "20:00"));
        
        ar.add(r.Incheon_Tokyo_Large("2019/04/09", "09:00"));
        ar.add(r.Incheon_Tokyo_Medium("2019/04/09", "10:00"));
        ar.add(r.Incheon_Tokyo_Small("2019/04/09", "11:00"));
        ar.add(r.Incheon_London_Large("2019/04/09", "12:00"));
        ar.add(r.Incheon_London_Large("2019/04/09", "13:00"));
        ar.add(r.Incheon_London_Large("2019/04/09", "14:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/09", "15:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/09", "16:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/09", "17:00"));
        
        ar.add(r.Incheon_Toronto_Large("2019/04/09", "18:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/09", "19:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/09", "20:00"));
        
        ar.add(r.Incheon_Tokyo_Large("2019/04/10", "09:00"));
        ar.add(r.Incheon_Tokyo_Medium("2019/04/10", "10:00"));
        ar.add(r.Incheon_Tokyo_Small("2019/04/10", "11:00"));
        ar.add(r.Incheon_London_Large("2019/04/10", "12:00"));
        ar.add(r.Incheon_London_Large("2019/04/10", "13:00"));
        ar.add(r.Incheon_London_Large("2019/04/10", "14:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/10", "15:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/10", "16:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/10", "17:00"));
        
        ar.add(r.Incheon_Toronto_Large("2019/04/10", "18:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/10", "19:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/10", "20:00"));
        
        ar.add(r.Incheon_Tokyo_Large("2019/04/11", "09:00"));
        ar.add(r.Incheon_Tokyo_Medium("2019/04/11", "10:00"));
        ar.add(r.Incheon_Tokyo_Small("2019/04/11", "11:00"));
        ar.add(r.Incheon_London_Large("2019/04/11", "12:00"));
        ar.add(r.Incheon_London_Large("2019/04/11", "13:00"));
        ar.add(r.Incheon_London_Large("2019/04/11", "14:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/11", "15:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/11", "16:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/11", "17:00"));
        
        ar.add(r.Incheon_Toronto_Large("2019/04/11", "18:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/11", "19:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/11", "20:00"));
        
        ar.add(r.Incheon_Tokyo_Large("2019/04/13", "09:00"));
        ar.add(r.Incheon_Tokyo_Medium("2019/04/13", "10:00"));
        ar.add(r.Incheon_Tokyo_Small("2019/04/13", "11:00"));
        ar.add(r.Incheon_London_Large("2019/04/13", "12:00"));
        ar.add(r.Incheon_London_Large("2019/04/13", "13:00"));
        ar.add(r.Incheon_London_Large("2019/04/13", "14:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/13", "15:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/13", "16:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/13", "17:00"));
    
        ar.add(r.Incheon_Toronto_Large("2019/04/13", "18:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/13", "19:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/13", "20:00"));
        
        ar.add(r.Incheon_Tokyo_Large("2019/04/14", "09:00"));
        ar.add(r.Incheon_Tokyo_Medium("2019/04/14", "10:00"));
        ar.add(r.Incheon_Tokyo_Small("2019/04/14", "11:00"));
        ar.add(r.Incheon_London_Large("2019/04/14", "12:00"));
        ar.add(r.Incheon_London_Large("2019/04/14", "13:00"));
        ar.add(r.Incheon_London_Large("2019/04/14", "14:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/14", "15:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/14", "16:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/14", "17:00"));
        
        ar.add(r.Incheon_Toronto_Large("2019/04/14", "18:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/14", "19:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/14", "20:00"));
        
        ar.add(r.Incheon_Tokyo_Large("2019/04/15", "09:00"));
        ar.add(r.Incheon_Tokyo_Medium("2019/04/15", "10:00"));
        ar.add(r.Incheon_Tokyo_Small("2019/04/15", "11:00"));
        ar.add(r.Incheon_London_Large("2019/04/15", "12:00"));
        ar.add(r.Incheon_London_Large("2019/04/15", "13:00"));
        ar.add(r.Incheon_London_Large("2019/04/15", "14:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/15", "15:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/15", "16:00"));
        ar.add(r.Incheon_Paris_Large("2019/04/15", "17:00"));
        
        ar.add(r.Incheon_Toronto_Large("2019/04/15", "18:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/15", "19:00"));
        ar.add(r.Incheon_Toronto_Large("2019/04/15", "20:00"));
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public Airplane getAirplane() {
        return airplane;
    }
    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
}