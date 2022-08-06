/*
 *Author :Alizwa Solibanzi
 * Student no: 220001499
 * APPLICATION DEVELOPMENT PRACTICE 3
 * ASSIGNMNET 1
 *
 */
package za.ac.cput.repository;

import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Category;


import java.util.List;
@Repository
public interface ICategoryRepository extends IRepository<Category,String> {

    public List<Category> getAll();

}
