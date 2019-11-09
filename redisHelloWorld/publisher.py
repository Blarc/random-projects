import redis
import json

# construct python-redis interface
r = redis.StrictRedis(host='localhost', port=6379, db=0)

# create and pass data to redis
data = {'a': 123, 'b': 321}
data = json.dumps(data)
r.publish('my_channel', data)
r.publish('my_channel', 'hello world!')
