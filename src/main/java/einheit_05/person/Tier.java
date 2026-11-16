package einheit_05.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tier {

    private String name;
    private int age;

    public static void main(String[] args) {
        Tier tier = new Tier("Bello", 4);
        System.out.println(tier);
    }
}
