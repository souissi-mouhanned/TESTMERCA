package Com.Merca.Mercarue.models;
import java.time.LocalDateTime;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table 
public class wor7428_postmeta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long meta_id;
	Long post_id ;
	
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String meta_key = null;
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String meta_value = null;
}
