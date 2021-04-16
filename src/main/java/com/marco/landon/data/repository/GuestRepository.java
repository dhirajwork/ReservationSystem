package com.marco.landon.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.marco.landon.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}