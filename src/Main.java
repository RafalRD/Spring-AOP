import com.api.ICook;
import com.impl.Cook;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args){
    
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ICook cook = context.getBean("cookBean", ICook.class);
        
        cook.getPizzaComponents();
        cook.makePizza();
        cook.salePizza();
        
        context.close();
    }

}
