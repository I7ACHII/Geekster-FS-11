package com.geekster.weekly_Test_7_Mappings.Repository;

import com.geekster.weekly_Test_7_Mappings.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAddressRepo extends JpaRepository<Address, Long> {

}
