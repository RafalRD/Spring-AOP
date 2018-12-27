import com.api.ICook;
import com.aspects.Communication;
import com.aspects.WarehouseControl;
import com.impl.Cook;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig
{
    @Bean
    public ICook cookBean(){
        return new Cook();
    }
    
    @Bean
    public Communication communicationBean(){
        return new Communication();
    }
    
    @Bean
    public WarehouseControl warehouseControlBean(){
        return new WarehouseControl();
    }
}
