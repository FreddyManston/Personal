#Author: Joshua Abraham
#Name: Shuffler
#Description: Incorporates different shuffling techniques

from random import random
import time

start = time.time()

def slowshuffle (sortedlist):
	
	shuffledlist = []
	isNotPresent = []

	for boolean in sortedlist:

		isNotPresent.append(True)
	
	integer = int((random()*len(sortedlist)) + 1)
		

	while (len(shuffledlist) != len(sortedlist) - 1):

		if isNotPresent[integer-1]:

			shuffledlist.append(integer)
			isNotPresent[integer-1] = False

		integer = int((random()*len(sortedlist) + 1))
	

	for lastnum in range(len(sortedlist)):

		if isNotPresent[lastnum]:
			
			shuffledlist.append(lastnum + 1)
			break

	#print("The time to shuffle this list with slowshuffle was: ", stop - start)
		

	return shuffledlist


def shuffle (shufflinglist):

	integer = int ( random() * len(shufflinglist) )

	for index in range(len(shufflinglist)):

		shufflinglist[index], shufflinglist[integer] = shufflinglist[integer], shufflinglist[index]
				
		#swopping = shufflinglist.pop(r - 1)
		#swopper = shufflinglist.pop(index + 1)

		#shufflinglist.append(index + 2, swopping)
		#shufflinglist.append(, swopper)

		integer = int ( random() * len(shufflinglist) )

	return shufflinglist



print (shuffle(list(range(1,60000))))

stop = time.time()
print (stop - start)


