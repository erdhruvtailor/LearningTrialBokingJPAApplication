# LearningTrialBokingJPAApplication
JpaRepository, Custom use of repository and RestController

Used Annotation
@RestController
@RequestMapping("/booking")
@GetMapping("/hello")
@RequestMapping(method = RequestMethod.GET, value = "hello2")
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Id
@Repository
@Query("SELECT * FROM booking WHERE category = ?")