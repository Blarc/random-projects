import redis
import json

# construct python-redis interface
r = redis.StrictRedis(host='localhost', port=6379, db=0)

# construct pubsub interface and subscribe to a channel
p = r.pubsub()
p.subscribe('my_channel')

while True:
    message = p.get_message()
    if message:
        print(message)