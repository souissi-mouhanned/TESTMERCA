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
public class wor7428_wc_customer_lookup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long customer_id;
	
	 @Column( columnDefinition = "bigint(20)")
		private Long user_id;
	 
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String username ;
		
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String first_name ;
		
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String last_name ;
		
	 @Column(columnDefinition = "VARCHAR(100) COLLATE utf8mb4_unicode_520_ci")
	 String email ;
		
	 @Column(columnDefinition = "CHAR(2) COLLATE utf8mb4_unicode_520_ci")
	 String country ;
		
	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String postcode ;
		
	 @Column(columnDefinition = "VARCHAR(100) COLLATE utf8mb4_unicode_520_ci")
	 String city ;
	 @Column(columnDefinition = "VARCHAR(100) COLLATE utf8mb4_unicode_520_ci")
	 String state ;
	 
	 //@Temporal(TemporalType.TIMESTAMP)
	    private LocalDateTime date_last_active;
	// @Temporal(TemporalType.TIMESTAMP)
	    private LocalDateTime date_registered;
	 
}
