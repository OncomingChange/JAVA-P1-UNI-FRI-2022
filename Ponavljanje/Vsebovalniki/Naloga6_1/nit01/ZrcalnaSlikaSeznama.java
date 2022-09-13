
import java.util.ArrayList;
import java.util.List;

public class ZrcalnaSlikaSeznama {
    public static <T> List<T> zrcalnaSlika(List<T> seznam) {
        int length = seznam.size();
        List<T> manzes = new ArrayList<>();
        for(int i = length - 1; i >= 0; i--) {
            manzes.add(length - i - 1, seznam.get(i));
        }
        return manzes;
    }
}
