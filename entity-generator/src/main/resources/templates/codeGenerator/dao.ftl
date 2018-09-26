package ${basePackage};

import org.springframework.stereotype.Repository;

import BaseDao;
import ${entityPackage}.${className};

@Repository
public class ${className}Dao extends BaseDao<${className}> {

    @Override
    protected String getTableName() {
        return "${tableName}";
    }
}