# AwsDyanmoDbRestAPI

4 W's of Amazon DyanmoDB:
What:
	DynamoDB is a fully managed NoSQL database service provided by Amazon.
	DynamoDB uses a NoSQL model, which means it uses a non-relational system.
	It requires only a primary key and doesn’t require a schema to create a table.


Why:
    It can store any amount of data and serve any amount of traffic.
    With DyanmoDB, you can expect a good performance even when it scales up. 
    It is a very simple and small API that follows key-value method to store, access and perform advanced data retrieval.


When to use it:
    The two main advantages of DynamoDB are scalability and flexibility.
	It does not force the use of a particular data source and structure, allowing users to work with virtually anything, but in a uniform way.
	Its design also supports a wide range of use from lighter tasks and operations to demanding enterprise functionality.
    When key-value or simple queries are present.
    When a very high read/write rate is needed but queries are simple.
    When auto-sharding is required.
    When auto-scaling is required.
    When low latency is required.
    When there is no size or throughput limit.
    When there is no tuning.
    When high durability is required.
	

When not to use it:
    When multi-item or cross table transactions are required
    When complex queries and joins are required
    When real-time analytics on historic data is required
	


Dynamo DB limitations:
https://medium.com/@dotronglong/5-reasons-not-to-use-dynamodb-fee97195136a

	Sorting is not a great option in Dynamo AWS.
	Text searching is limited.
	Pagination is hard
	Consistency is not applicable for indexes

    Capacity Unit Sizes − A read capacity unit is a single consistent read per second for items no larger than 4KB. A write capacity unit is a single write per second for items no bigger than 1KB.

    Provisioned Throughput Min/Max − All tables and global secondary indices have a minimum of one read and one write capacity unit. Maximums depend on region. In the US, 40K read and write remains the cap per table (80K per account), and other regions have a cap of 10K per table with a 20K account cap.

    Provisioned Throughput Increase and Decrease − You can increase this as often as needed, but decreases remain limited to no more than four times daily per table.

    Table Size and Quantity Per Account − Table sizes have no limits, but accounts have a 256 table limit unless you request a higher cap.

    Secondary Indexes Per Table − Five local and five global are permitted.

    Projected Secondary Index Attributes Per Table − DynamoDB allows 20 attributes.

    Partition Key Length and Values − Their minimum length sits at 1 byte, and maximum at 2048 bytes, however, DynamoDB places no limit on values.

    Sort Key Length and Values − Its minimum length stands at 1 byte, and maximum at 1024 bytes, with no limit for values unless its table uses a local secondary index.

    Table and Secondary Index Names − Names must conform to a minimum of 3 characters in length, and a maximum of 255. They use the following characters: AZ, a-z, 0-9, “_”, “-”, and “.”.

    Attribute Names − One character remains the minimum, and 64KB the maximum, with exceptions for keys and certain attributes.

    Reserved Words − DynamoDB does not prevent the use of reserved words as names.

    Expression Length − Expression strings have a 4KB limit. Attribute expressions have a 255-byte limit. Substitution variables of an expression have a 2MB limit.






Additional Info:

->Diff between RDBMS and DynamoDB:
	Common Tasks 	RDBMS 	DynamoDB
	Connect to the Source ->	RDBMS uses a persistent connection and SQL commands. 	DynamoDB uses HTTP requests and API operations
	Create a Table ->	RDBMS fundamental structures are tables, and must be defined. 	DynamoDB only uses primary keys, and no schema on creation. It uses various data sources.
	Get Table Info ->	All table info remains accessible. In DynamoDB,Only primary keys are revealed.
	Load Table Data ->	RDBMS uses rows made of columns. 	In tables, it uses items made of attributes
	Read Table Data ->	RDBMS uses SELECT statements and filtering statements. 	DynamoDB uses GetItem, Query, and Scan.
	Manage Indexes  -> 	RDBMS uses standard indexes created through SQL statements. Modifications to it occur automatically on table changes. 	It uses a secondary index to achieve the same function. DynamoDB requires specifications (partition key and sort key).
	Modify Table Data ->	RDBMS uses an UPDATE statement. 	DynamoDB uses an UpdateItem operation.
	Delete Table Data -> 	RDBMS uses a DELETE statement. 	DynamoDB uses a DeleteItem operation.
	Delete a Table  ->	RDBMS uses a DROP TABLE statement. 	DynamoDB uses a DeleteTable operation.



->You set the endpoint to indicate that you are creating the table in DynamoDB on your computer. 
