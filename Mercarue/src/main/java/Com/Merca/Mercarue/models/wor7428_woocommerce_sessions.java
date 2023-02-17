package Com.Merca.Mercarue.models;

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
public class wor7428_woocommerce_sessions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long session_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long session_expiry;
	 
	@Column(columnDefinition = "CHAR(32) COLLATE utf8mb4_unicode_520_ci")
	 String session_key ;
		
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci")
	 String session_value ;
}
