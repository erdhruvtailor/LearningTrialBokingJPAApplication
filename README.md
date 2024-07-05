# LearningTrialBokingJPAApplication
From 18, 22 June, 02 July Session
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

@RequestParamater is more preferable as compared to @PathVariable("name")


@RequestMapping(method = RequestMethod.GET, value = "hello2")
@Query("SELECT * FROM booking WHERE category = ?")

Use of commons-lang3 for checking isNotBlank

@RequestBody String message,
@RequestBody User user,
@RequestBody Booking booking


@GeneratedValue(strategy = GenerationType.AUTO)

@Query("Select b from Booking b Where b.location =?1")
@Query(value = "Select * from Booking b Where b.location =?1",nativeQuery = true)

Note:
If two different datatype parameter for return, use DTO contract/map

fetch=Lazy(get just used child entity if its using) / Eager (get all child entity data)
cascade=

PERSIST: when Question is deleted, answers not impacted
All: when Question is deleted, answers also be deleted

If cascade = CascadeType.ALL Or PERSIST, 
child entity do not need to special insert.
