# LearningTrialBokingJPAApplication
From 18 and 22 June Session
JpaRepository, Custom use of repository and RestController

Used Annotation::
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Id
@Repository

@RestController
@RequestMapping("/booking")
@GetMapping("/hello")

@GetMapping("/hello/{name}")
@PathVariable("name")
Note: pathvariable attribute/parameter/argument name must be same in @PathVariable and in @GetMapping

For Query Paramater
@RequestParamater: @RequestParamater String QueryParamaterName 


@RequestMapping(method = RequestMethod.GET, value = "hello2")
@Query("SELECT * FROM booking WHERE category = ?")

Use of commons-lang3 for checking isNotBlank

@RequestBody String message,
@RequestBody User user,
@RequestBody Booking booking


@GeneratedValue(strategy = GenerationType.AUTO)

@Query("Select b from Booking b Where b.location =?1")
@Query(value = "Select * from Booking b Where b.location =?1",nativeQuery = true)