package VideoClub;
import VideoClub.VideoClub;
import java.util.ArrayList;

public class Sucursales {
    private ArrayList<VideoClub> locales;

    public Sucursales(ArrayList<VideoClub> locales) {
        this.locales = locales;
    }

    public ArrayList<VideoClub> getLocales() {
        return locales;
    }

    public void setLocales(ArrayList<VideoClub> locales) {
        this.locales = locales;
    }

    public void agregar_VideoClub(VideoClub localNuevo){
        locales.add(localNuevo);
    }
    public void eliminar_VideoClub(VideoClub localViejo){
        locales.remove(localViejo);
    }
    public void modificar_VideoClub(VideoClub localViejo, VideoClub localNuevo) {
        locales.remove(localViejo);
        locales.add(localNuevo);
    }

    public static void main(String[] args) {
        VideoClub localNuevo = new VideoClub();
        VideoClub localViejo = new VideoClub();
    }
}
