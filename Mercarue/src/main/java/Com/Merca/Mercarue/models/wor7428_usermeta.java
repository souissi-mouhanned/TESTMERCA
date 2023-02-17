package Com.Merca.Mercarue.models;

import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table 
		
public class wor7428_usermeta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long umeta_id;
	
	 @Column( columnDefinition = "bigint(20)")
		private Long user_id;
	 
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String meta_key ;
	
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String meta_value ;
}
