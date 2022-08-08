package rhtmddnjs.springprc.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import rhtmddnjs.springprc.domain.User;
import rhtmddnjs.springprc.repository.UserRepository;

import javax.persistence.EntityManager;


@SpringBootTest
@Transactional
@ExtendWith(SpringExtension.class) //RunWith 대타
class UserServiceTest {

    @Autowired UserRepository userRepository ;
    @Autowired UserService userService;
    @Autowired EntityManager em;


    @Test
    void join() throws Exception{
        //given
        User user = new User();
        user.setName("Kim");
        user.setPassword("qw12QW!@");
        user.setPhoneNum(01023605763L);

        //when
        Long saveId = userService.join(user);

        //then
        em.flush();
        Assertions.assertEquals(user, userRepository.findOne(saveId));

    }

    @Test
    void findUsers() {
    }

    @Test
    void findOne() {
    }
}