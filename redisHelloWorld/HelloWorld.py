import redis
import json

# construct python-redis interface
r = redis.StrictRedis(host='localhost', port=6379, db=0)

# create and pass data to redis
data = {'a': 123, 'b': 321}
data = json.dumps(data)
r.set('data', data)
r.set('my_string', 'hello world!')

print(json.loads(r.get('data')))
print(r.get('my_string'))
