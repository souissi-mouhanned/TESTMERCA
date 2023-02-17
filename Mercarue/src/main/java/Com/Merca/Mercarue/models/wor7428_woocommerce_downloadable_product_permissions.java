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
public class wor7428_woocommerce_downloadable_product_permissions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long permission_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long product_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long order_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long user_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long download_count;
	
	
	 @Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String order_key ;
	 
	 @Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String user_email ;
		
	 @Column(columnDefinition = "VARCHAR(9) COLLATE utf8mb4_unicode_520_ci")
	 String downloads_remaining ;
	 
	 @Column(columnDefinition = "VARCHAR(36) COLLATE utf8mb4_unicode_520_ci")
	 String download_id ;
	 
		LocalDateTime 	 access_granted ;
		 LocalDateTime access_expires ;
}
