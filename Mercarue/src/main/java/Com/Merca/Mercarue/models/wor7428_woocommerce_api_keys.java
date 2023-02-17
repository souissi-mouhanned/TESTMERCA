package Com.Merca.Mercarue.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table 
		
public class wor7428_woocommerce_api_keys {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long key_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long user_id;
	
	 @Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String description ;
	 
	 @Column(columnDefinition = "VARCHAR(10) COLLATE utf8mb4_unicode_520_ci")
	 String permissions ;
		
	 @Column(columnDefinition = "CHAR(64) COLLATE utf8mb4_unicode_520_ci")
	 String consumer_key ;
	 
	 @Column(columnDefinition = "CHAR(43) COLLATE utf8mb4_unicode_520_ci")
	 String consumer_secret ;
		
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci")
	 String nonces ;
		
	 @Column(columnDefinition = "CHAR(7) COLLATE utf8mb4_unicode_520_ci")
	 String truncated_key ;
	 
	 LocalDateTime 	 last_access ;


}
