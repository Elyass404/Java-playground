public class Driver{

    String name ;
    int titles; 
    String team; 

    public Driver (String name, int titles, String team){
        this.name  =name;
        this.titles =titles;
        this.team  =team;
    }

    public int getTitles(){
        return titles; 
    }


    public String getName(){
        return name; 
    }

    public String getTeam(){
        return team; 
    }
}