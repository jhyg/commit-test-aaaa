package commit.test.aaaa.domain;

import commit.test.aaaa.BoundedContext281Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="A_table")
@Data

public class A  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){
    }

    public static ARepository repository(){
        ARepository aRepository = BoundedContext281Application.applicationContext.getBean(ARepository.class);
        return aRepository;
    }






}
