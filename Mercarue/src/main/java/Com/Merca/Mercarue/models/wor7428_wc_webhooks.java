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
		
public class wor7428_wc_webhooks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long webhook_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long user_id;
	  
	@Column( columnDefinition = "smallint(4) ")
	private Long api_version;
	  
	@Column( columnDefinition = "smallint(32) ")
	private Long failure_count;
	  
	@Column( columnDefinition = "tinyint(1)")
	private Long pending_delivery;
	
	
	 @Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String status ;
	 
	 @Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String topic ;
		
	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci")
	 String name ;
	 
	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci")
	 String delivery_url ;
		
	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci")
	 String secret ;
	 
	 LocalDateTime 	 date_created ;
	 LocalDateTime date_created_gmt ;
	 LocalDateTime 	 date_modified ;
	 LocalDateTime date_modified_gmt ;
	 
	 

}
