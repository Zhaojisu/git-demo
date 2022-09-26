package com.zhaojisu.api;
import com.zhaojisu.domain.People;
import com.zhaojisu.service.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
  private final Logger logger= LoggerFactory.getLogger(FirstController.class);

  private PeopleService peopleService;

  @Autowired
  FirstController(PeopleService peopleService){
      this.peopleService=peopleService;
  }

  @GetMapping("/test")
  public String hello(){
     logger.info("hello");
     return "hello";
  }

  @GetMapping("/one")
  public Integer getMultiplication(Integer id){
      logger.info("参数id:{}",id);
      return id!=null?id*10:0;
  }

  @PostMapping("/two")
    public String getString(@RequestBody People people){
      logger.info("参数people:{}",people);
      return people.getName()+","+people.getSex()+"性,"+people.getAge()+"周岁";
  }

  @PutMapping("/three")
    public People getPeople(@RequestBody People people){
      logger.info("参数people:{}",people);
      return peopleService.judgeAdult(people);
  }

  @DeleteMapping("/four")
  public String deletePeople(@RequestBody People people){
      logger.info("参数people:{}",people);
      return peopleService.deletePeople(people)+"信息已删除";
  }
}
